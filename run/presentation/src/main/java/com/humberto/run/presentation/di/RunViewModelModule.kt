package com.humberto.run.presentation.di

import com.humberto.run.presentation.run_overview.RunOverviewViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val runViewModuleModule = module {
    viewModelOf(::RunOverviewViewModel)
}