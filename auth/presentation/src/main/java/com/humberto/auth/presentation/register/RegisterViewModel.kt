package com.humberto.auth.presentation.register

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.humberto.auth.domain.UserDataValidator
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


class RegisterViewModel(
    private val userDataValidator: UserDataValidator
) : ViewModel() {

    var state by mutableStateOf(RegisterState())
        private set

    init {
        viewModelScope.launch {
            collectEmail()
        }
        viewModelScope.launch {
            collectPassword()
        }
    }

    private suspend fun collectEmail() {
        snapshotFlow { state.email.text }
            .collectLatest { email ->
                val isValidEmail = userDataValidator.isValidEmail(email.toString())
                state = state.copy(
                    isEmailValid = isValidEmail,
                    canRegister = isValidEmail && state.passwordValidationState.isValidPassword
                            && !state.isRegistering
                )
            }
    }

    private suspend fun collectPassword() {
        snapshotFlow { state.password.text }
            .collectLatest { password ->
                val passwordValidationState =
                    userDataValidator.validatePassword(password.toString())
                state = state.copy(
                    passwordValidationState = passwordValidationState,
                    canRegister = state.isEmailValid && passwordValidationState.isValidPassword
                            && !state.isRegistering
                )
            }
    }

    fun onAction(action: RegisterAction) {

    }
}