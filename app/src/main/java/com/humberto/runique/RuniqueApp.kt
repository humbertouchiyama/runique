package com.humberto.runique

import android.app.Application
import com.humberto.auth.data.di.authDataModule
import com.humberto.auth.presentation.di.authViewModuleModule
import com.humberto.core.data.networking.di.coreDataModule
import com.humberto.runique.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class RuniqueApp: Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            modules (
                authDataModule,
                authViewModuleModule,
                appModule,
                coreDataModule
            )
        }
    }
}