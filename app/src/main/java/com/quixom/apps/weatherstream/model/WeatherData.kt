package com.quixom.apps.weatherstream.model

import com.google.gson.annotations.Expose
import com.quixom.apps.weatherstream.dbconfig.WeatherStreamDB
import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import com.raizlabs.android.dbflow.sql.language.SQLite
import com.raizlabs.android.dbflow.structure.BaseModel

/**
* Created by akif on 11/9/17.
*/

@Table(name = WeatherData.TABLE_NAME, database = WeatherStreamDB::class)
class WeatherData(@Column @PrimaryKey @Expose var id: Long? = null,
                  @Column @Expose var dt: Long? = null,
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

        fun getLocationBasedWeatherDetails(): WeatherData? = SQLite.select().distinct().from<WeatherData>(WeatherData::class.java).querySingle()
    }

    @Table(name = Clouds.TABLE_NAME, database = WeatherStreamDB::class)
    class Clouds(@Column @PrimaryKey(autoincrement = true) var id: Int? = null,
                 @Column @Expose var all: Int? = null) : BaseModel() {
        companion object {
            const val TABLE_NAME = "CloudsWeather"
            fun getCloudWeatherDetails(): Clouds? = SQLite.select().distinct().from<Clouds>(Clouds::class.java).querySingle()
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
            fun getWindWeatherDetails(): Wind? = SQLite.select().distinct().from<Wind>(Wind::class.java).querySingle()
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
            @Column @Expose var country: String? = null,
            @Column @Expose var pod: String? = null) : BaseModel() {
        companion object {
            const val TABLE_NAME = "SysWeather"
            fun getSysWeatherDetails(): Sys? = SQLite.select().distinct().from<Sys>(Sys::class.java).querySingle()
            fun getSysListDetails(): List<Sys> ? = SQLite.select().distinct().from<Sys>(Sys::class.java).queryList()
        }
    }

    @Table(name = Weather.TABLE_NAME, database = WeatherStreamDB::class)
    class Weather(@Column @PrimaryKey (autoincrement = true) @Expose var wId: Int ? = null,
                  @Column @Expose var id: Int? = null,
                  @Column @Expose var icon: String? = null,
                  @Column @Expose var description: String? = null,
                  @Column @Expose var main: String? = null) : BaseModel() {

        companion object {
            const val TABLE_NAME = "WeatherDescription"
            fun getInnerWeatherDetails(): Weather? = SQLite.select().distinct().from<Weather>(Weather::class.java).querySingle()
        }
    }

    @Table(name = Main.TABLE_NAME, database = WeatherStreamDB::class)
    class Main(@Column @PrimaryKey(autoincrement = true) @Expose var id: Int? = null,
               @Column @Expose var humidity: String? = null,
               @Column @Expose var pressure: String? = null,
               @Column @Expose var temp_max: String? = null,
               @Column @Expose var temp_min: String? = null,
               @Column @Expose var temp: String? = null,
               @Column @Expose var sea_level: Double? = null,
               @Column @Expose var grnd_level: Double? = null,
               @Column @Expose var temp_kf: Double? = null) : BaseModel() {
        companion object {
            const val TABLE_NAME = "MainWeather"
            fun getMainWeatherDetails(): Main? = SQLite.select().distinct().from<Main>(Main::class.java).querySingle()
            fun getMainWeatherList(): List<Main>? = SQLite.select().distinct().from<Main>(Main::class.java).queryList()
        }
    }
}