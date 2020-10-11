package com.viktor

import android.app.Application
import com.viktor.innap.didemoapp.di.ModuleList
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.dsl.koinApplication

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            // use AndroidLogger as Koin Logger - default Level.INFO
            androidLogger()

            // use the Android context given there
            androidContext(this@App)

            // load properties from assets/koin.properties file
            androidFileProperties()

            modules(ModuleList.getMainModule(), ModuleList.getHttpModule())
        }
    }
}