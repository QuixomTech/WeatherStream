package com.quixom.apps.weatherstream.dbconfig

import com.raizlabs.android.dbflow.annotation.Database

/**
* Created by akif on 11/13/17.
*/

@Database(name = WeatherStreamDB.NAME, version = WeatherStreamDB.VERSION)
class WeatherStreamDB {
    companion object {
        const val NAME = "WeatherStream"
        const val VERSION = 1
    }
}