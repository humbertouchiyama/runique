package com.humberto.auth.presentation.di

import com.humberto.auth.presentation.login.LoginViewModel
import com.humberto.auth.presentation.register.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val authViewModuleModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::LoginViewModel)
}