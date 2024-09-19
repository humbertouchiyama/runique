package com.humberto.core.data.networking.di

import android.content.SharedPreferences
import com.humberto.core.data.networking.HttpClientFactory
import com.humberto.core.data.networking.auth.EncryptedSessionStorage
import com.humberto.core.domain.util.SessionStorage
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory().build()
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()
}