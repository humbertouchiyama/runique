package com.humberto.run.data.di

import com.humberto.core.domain.run.SyncRunScheduler
import com.humberto.run.data.CreateRunWorker
import com.humberto.run.data.DeleteRunWorker
import com.humberto.run.data.FetchRunsWorker
import com.humberto.run.data.SyncRunWorkerScheduler
import org.koin.androidx.workmanager.dsl.workerOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val runDataModule = module {
    workerOf(::CreateRunWorker)
    workerOf(::FetchRunsWorker)
    workerOf(::DeleteRunWorker)

    singleOf(::SyncRunWorkerScheduler).bind<SyncRunScheduler>()
}