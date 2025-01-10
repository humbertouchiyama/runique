package com.humberto.analytics.data.di

import com.humberto.analytics.data.RoomAnalyticsRepository
import com.humberto.analytics.domain.AnalyticsRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val analyticsModule = module {
    singleOf(::RoomAnalyticsRepository).bind<AnalyticsRepository>()
}