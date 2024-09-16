package com.humberto.auth.data.di

import com.humberto.auth.data.EmailPatternValidator
import com.humberto.auth.domain.PatternValidator
import com.humberto.auth.domain.UserDataValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
}