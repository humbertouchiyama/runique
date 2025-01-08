package com.humberto.runique

import android.app.Application
import com.humberto.auth.data.di.authDataModule
import com.humberto.auth.presentation.di.authViewModuleModule
import com.humberto.core.data.networking.di.coreDataModule
import com.humberto.core.database.di.databaseModule
import com.humberto.run.data.di.runDataModule
import com.humberto.run.location.di.locationModule
import com.humberto.run.network.di.networkModule
import com.humberto.run.presentation.di.runPresentationModule
import com.humberto.runique.di.appModule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.workmanager.koin.workManagerFactory
import org.koin.core.context.startKoin
import timber.log.Timber

class RuniqueApp: Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            workManagerFactory()
            modules (
                authDataModule,
                authViewModuleModule,
                appModule,
                coreDataModule,
                runPresentationModule,
                locationModule,
                databaseModule,
                networkModule,
                runDataModule
            )
        }
    }
}