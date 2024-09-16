package com.humberto.auth.presentation.register

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.humberto.auth.domain.UserDataValidator
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach


class RegisterViewModel(
    private val userDataValidator: UserDataValidator
): ViewModel() {

    private val _email = MutableStateFlow("")
    private val email = _email.asStateFlow()
    private val _password = MutableStateFlow("")
    private val password = _password.asStateFlow()

    var state by mutableStateOf(RegisterState())
        private set

    init {
        email.onEach { email ->
            state = state.copy(
                isEmailValid = userDataValidator.isValidEmail(email)
            )
        }.launchIn(viewModelScope)
        password.onEach { password ->
            state = state.copy(
                passwordValidationState = userDataValidator.validatePassword(password)
            )
        }.launchIn(viewModelScope)
    }

    fun onAction(action: RegisterAction) {

    }
}