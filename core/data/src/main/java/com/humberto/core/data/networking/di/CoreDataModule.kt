package com.humberto.core.data.networking.di

import com.humberto.core.data.networking.HttpClientFactory
import com.humberto.core.data.networking.auth.EncryptedSessionStorage
import com.humberto.core.data.run.OfflineFirstRunRepository
import com.humberto.core.domain.run.RunRepository
import com.humberto.core.domain.util.SessionStorage
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory(get()).build()
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()
    singleOf(::OfflineFirstRunRepository).bind<RunRepository>()
}