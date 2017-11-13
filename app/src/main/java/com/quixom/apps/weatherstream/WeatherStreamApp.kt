package com.quixom.apps.weatherstream

import android.app.Application
import android.support.v7.app.AppCompatDelegate
import com.raizlabs.android.dbflow.config.FlowConfig
import com.raizlabs.android.dbflow.config.FlowManager

/**
* Created by akif on 11/2/17.
*/
class WeatherStreamApp: Application() {
    override fun onCreate() {
        super.onCreate()
        // Make sure we use vector drawables
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)

        // This instantiates DBFlow
        FlowManager.init(FlowConfig.Builder(this).build())
    }

    override fun onTerminate() {
        super.onTerminate()
        FlowManager.destroy()
    }
}