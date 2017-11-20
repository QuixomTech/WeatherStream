package com.quixom.apps.weatherstream.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.quixom.apps.weatherstream.dbconfig.WeatherStreamDB
import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import com.raizlabs.android.dbflow.sql.language.SQLite
import com.raizlabs.android.dbflow.structure.BaseModel

/**
* Created by akif on 11/9/17.
*/

@Table(name = WeatherForecastData.TABLE_NAME, database = WeatherStreamDB::class)
class WeatherForecastData(@Column @PrimaryKey @Expose var id: Long? = null,
                          @Column @Expose var message: String? = null,
                          @Column @Expose var cnt: Long? = null,
                          @Column @Expose var cod: String? = null,
                          @Column @Expose var dt: Long? = null,
                          @Expose var list: Array<ForecastList>? = null,
                          @Expose var city: City? = null) : BaseModel() {

    companion object {
        const val TABLE_NAME = "WeatherForecast"
        fun getWeatherForecastDetails(): WeatherForecastData? = SQLite.select().distinct().from<WeatherForecastData>(WeatherForecastData::class.java).querySingle()
        fun getWeatherForecastList(): List<WeatherForecastData>? = SQLite.select().distinct().from<WeatherForecastData>(WeatherForecastData::class.java).queryList()

    }

    @Table(name = ForecastList.TABLE_NAME, database = WeatherStreamDB::class)
    class ForecastList(@Column @PrimaryKey (autoincrement = true) var id: Long? = null,
               @Expose var clouds: WeatherData.Clouds? = null,
               @Column @Expose var dt: Long? = null,
               @Expose var wind: WeatherData.Wind? = null,
               @Expose var sys: WeatherData.Sys? = null,
               @Expose var weather: Array<WeatherData.Weather>? = null,
               @Column @Expose var dt_txt: String? = null,
               @Expose var rain: Rain? = null,
               @Expose var main: WeatherData.Main? = null) : BaseModel() {
        companion object {
            const val TABLE_NAME = "ForecastList"
            fun getForecastList(): List<ForecastList>? = SQLite.select().distinct().from<ForecastList>(ForecastList::class.java).queryList()

        }
    }

    class City(@Expose var id: Long? = null,
               @Expose var name: String? = null,
               @Expose var country: String? = null,
               @Expose var coord: WeatherData.Coord? = null)

    @Table(name = Rain.TABLE_NAME, database = WeatherStreamDB::class)
    class Rain(@Column @PrimaryKey(autoincrement = true) @Expose var id: Long? = null,
               @SerializedName("3h")
               @Column @Expose var rainCount: Double? = null): BaseModel() {
        companion object {
            const val TABLE_NAME = "Rain"
            fun getRainData(): List<Rain>? = SQLite.select().distinct().from<Rain>(Rain::class.java).queryList()
        }
    }
}