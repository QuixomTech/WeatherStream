package com.quixom.apps.weatherstream.model

import com.google.gson.annotations.Expose
import com.quixom.apps.weatherstream.dbconfig.WeatherStreamDB
import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import com.raizlabs.android.dbflow.sql.language.SQLite
import com.raizlabs.android.dbflow.structure.BaseModel

/**
* Created by akif on 11/13/17.
*/

@Table(name = LocationSearchHistory.TABLE_NAME, database = WeatherStreamDB::class)
class LocationSearchHistory(@Column @PrimaryKey @Expose var id: Long? = null,
                            @Column @Expose var cityName: String? = null,
                            @Column @Expose var countyName: String? = null,
                            @Column @Expose var weatherType: Int? = null,
                            @Column @Expose var temperature: Double? = null,
                            @Column @Expose var lat: Double? = null,
                            @Column @Expose var lon: Double? = null) : BaseModel() {
    companion object {
        const val TABLE_NAME = "LocationSearchHistory"

        fun getSearchedLocationList(): List<LocationSearchHistory> = SQLite.select()
                .distinct()
                .from<LocationSearchHistory>(LocationSearchHistory::class.java)
                .where()
                .orderBy(LocationSearchHistory_Table.cityName, false)
                .queryList()

        fun getLocationInfo (cityName: String, countryName: String): LocationSearchHistory =
                SQLite.select().distinct().from<LocationSearchHistory>(LocationSearchHistory::class.java)
                        .where(LocationSearchHistory_Table.cityName.eq(cityName)).and(LocationSearchHistory_Table.countyName.eq(countryName)).querySingle()!!
    }
}