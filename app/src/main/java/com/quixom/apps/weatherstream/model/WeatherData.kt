package com.quixom.apps.weatherstream.model

import com.google.gson.annotations.Expose
import com.quixom.apps.weatherstream.dbconfig.WeatherStreamDB
import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import com.raizlabs.android.dbflow.structure.BaseModel

/**
 * Created by akif on 11/9/17.
 */

@Table(name = WeatherData.TABLE_NAME, database = WeatherStreamDB::class)
class WeatherData(@Column @PrimaryKey @Expose var id: String? = null,
                  @Column @Expose var dt: String? = null,
                  @Expose var clouds: Clouds? = null,
                  @Expose var coord: Coord? = null,
                  @Expose var wind: Wind? = null,
                  @Column @Expose var cod: Int? = null,
                  @Column @Expose var visibility: String? = null,
                  @Expose var sys: Sys? = null,
                  @Column @Expose var name: String? = null,
                  @Column @Expose var base: String? = null,
                  @Expose var weather: Array<Weather>? = null,
                  @Expose var main: Main? = null) : BaseModel() {

    companion object {
        const val TABLE_NAME = "WeatherDetail"
    }

    @Table(name = Clouds.TABLE_NAME, database = WeatherStreamDB::class)
    class Clouds(@Column @PrimaryKey(autoincrement = true) var id: Int? = null,
                 @Column @Expose var all: String? = null) : BaseModel() {
        companion object {
            const val TABLE_NAME = "CloudsWeather"
        }
    }

    @Table(name = Coord.TABLE_NAME, database = WeatherStreamDB::class)
    class Coord(@Column @PrimaryKey(autoincrement = true) @Expose var id: Int? = null,
                @Column @Expose var lon: String? = null,
                @Column @Expose var lat: String? = null) : BaseModel() {
        companion object {
            const val TABLE_NAME = "CoordWeather"
        }
    }

    @Table(name = Wind.TABLE_NAME, database = WeatherStreamDB::class)
    class Wind(@Column @PrimaryKey(autoincrement = true) @Expose var id: Int? = null,
               @Column @Expose var speed: String? = null,
               @Column @Expose var deg: String? = null) : BaseModel() {
        companion object {
            const val TABLE_NAME = "WindWeather"
        }
    }

    @Table(name = Sys.TABLE_NAME, database = WeatherStreamDB::class)
    class Sys(
            @Column @PrimaryKey(autoincrement = true) @Expose var sysId: Int? = null,
            @Column @Expose var message: String? = null,
            @Column @Expose var id: Int? = null,
            @Column @Expose var sunset: Long? = null,
            @Column @Expose var sunrise: Long? = null,
            @Column @Expose var type: Int? = null,
            @Column @Expose var country: String? = null) : BaseModel() {
        companion object {
            const val TABLE_NAME = "SysWeather"
        }
    }

    @Table(name = Weather.TABLE_NAME, database = WeatherStreamDB::class)
    class Weather(@Column @PrimaryKey @Expose var id: Int? = null,
                  @Column @Expose var icon: String? = null,
                  @Column @Expose var description: String? = null,
                  @Column @Expose var main: String? = null) : BaseModel() {

        companion object {
            const val TABLE_NAME = "WeatherDescription"
        }
    }

    @Table(name = Main.TABLE_NAME, database = WeatherStreamDB::class)
    class Main(@Column @PrimaryKey(autoincrement = true) @Expose var id: Int? = null,
               @Column @Expose var humidity: String? = null,
               @Column @Expose var pressure: String? = null,
               @Column @Expose var temp_max: String? = null,
               @Column @Expose var temp_min: String? = null,
               @Column @Expose var temp: String? = null) : BaseModel() {
        companion object {
            const val TABLE_NAME = "MainWeather"
        }
    }
}