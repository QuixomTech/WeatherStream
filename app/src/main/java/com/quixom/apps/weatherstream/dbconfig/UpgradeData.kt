package com.quixom.apps.weatherstream.dbconfig

import com.quixom.apps.weatherstream.model.LocationSearchHistory
import com.quixom.apps.weatherstream.model.WeatherData
import com.raizlabs.android.dbflow.sql.language.Delete

/**
* Created by akif on 13/11/17.
*/

object UpgradeData {

    fun clearApplicationData() {
        Delete.table(WeatherData::class.java)
    }

    fun clearSearchHistory() {
        Delete.table(LocationSearchHistory::class.java)
    }
}
