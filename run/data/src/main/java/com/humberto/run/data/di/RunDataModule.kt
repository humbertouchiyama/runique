package com.humberto.run.data.di

import com.humberto.run.data.CreateRunWorker
import com.humberto.run.data.DeleteRunWorker
import com.humberto.run.data.FetchRunsWorker
import org.koin.androidx.workmanager.dsl.workerOf
import org.koin.dsl.module

val runDataModule = module {
    workerOf(::CreateRunWorker)
    workerOf(::FetchRunsWorker)
    workerOf(::DeleteRunWorker)
}