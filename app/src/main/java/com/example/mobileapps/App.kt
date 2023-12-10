package com.example.mobileapps

import android.app.Application
import com.example.mobileapps.di.networkModule
import com.example.mobileapps.di.repositoryModule
import com.example.mobileapps.di.roomModule
import com.example.mobileapps.di.viewModelModule
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
            androidContext(this@App)
            modules(listOf(
                networkModule,
                roomModule,
                repositoryModule,
                viewModelModule

            ))
        }
    }
}