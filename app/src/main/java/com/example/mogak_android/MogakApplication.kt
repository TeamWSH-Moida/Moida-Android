package com.example.mogak_android

import android.app.Application
import com.example.di.apiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

class WshApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@WshApplication)
            modules(signalModule)
        }
    }
}

val signalModule: Module
    get() = module {
        includes(
            apiModule,
        )
    }