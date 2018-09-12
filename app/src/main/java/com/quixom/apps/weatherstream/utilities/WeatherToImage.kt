package com.quixom.apps.weatherstream.utilities

import com.github.matteobattilana.weather.PrecipType
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.fragments.MainFragment

/**
* Created by akif on 14/11/17.
*/
object WeatherToImage {

    fun getWeatherTypeConditionCode(mainFragment: MainFragment?, code: String): Int = when (code) {

    /*** Thunderstorm **/
        "200" -> {
            // thunderstorm with light rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_thunderstrome_light_rain
        }
        "201" -> {
            // thunderstorm with light rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_thunderstrome_light_rain
        }
        "202" -> {
            // thunderstorm with heavy rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_thunderstrome_light_rain
        }
        "210" -> {
            // light thunderstorm
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_clouds_of_storm
        }
        "211" -> {
            // thunderstorm
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_clouds_of_storm
        }
        "212" -> {
            // heavy thunderstorm
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_clouds_of_storm
        }
        "221" -> {
            // ragged thunderstorm
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_clouds_of_storm
        }
        "230" -> {
            // thunderstorm with light drizzle
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_cloud_with_electrical_lightning_storm
        }
        "231" -> {
            // thunderstorm with drizzle
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_cloud_with_electrical_lightning_storm
        }
        "232" -> {
            // thunderstorm with heavy drizzle
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_cloud_with_electrical_lightning_storm
        }

    /*** Drizzle  **/
        "300" -> {
            // light intensity drizzle
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_drizzle
        }
        "301" -> {
            // drizzle
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_drizzle
        }
        "302" -> {
            // heavy intensity drizzle
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_drizzle
        }
        "310" -> {
            // light intensity drizzle rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_drizzle
        }
        "311" -> {
            // drizzle rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_drizzle
        }
        "312" -> {
            // heavy intensity drizzle rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_drizzle
        }
        "313" -> {
            // shower rain and drizzle
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_drizzle
        }
        "314" -> {
            // heavy shower rain and drizzle
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_drizzle
        }
        "321" -> {
            // shower drizzle
            R.drawable.ic_drizzle
        }

    /*** Rain **/
        "500" -> {
            // light rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_rain_cloud_black
        }
        "501" -> {
            // moderate rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_thunderstrome_light_rain
        }
        "502" -> {
            // heavy intensity rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_raindrops_of_rain_falling_of_dark_cloud
        }
        "503" -> {
            // very heavy rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_raindrops_of_rain_falling_of_dark_cloud
        }
        "504" -> {
            // extreme rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_raindrops_of_rain_falling_of_dark_cloud
        }
        "511" -> {
            // freezing rain
            mainFragment?.setWeatherData(PrecipType.SNOW)
            R.drawable.ic_snow_cloud
        }
        "520" -> {
            // light intensity shower rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_rain_cloud_black
        }
        "521" -> {
            // shower rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_rain_cloud_black
        }
        "522" -> {
            // heavy intensity shower rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_rain_cloud_black
        }
        "531" -> {
            // ragged shower rain
            mainFragment?.setWeatherData(PrecipType.RAIN)
            R.drawable.ic_rain_cloud_black
        }

    /*** Snow **/
        "600" -> {
            // light snow
            mainFragment?.setWeatherData(PrecipType.SNOW)
            R.drawable.ic_snow_storm_day_winter_weather
        }
        "601" -> {
            // snow
            mainFragment?.setWeatherData(PrecipType.SNOW)
            R.drawable.ic_snow_cloud
        }
        "602" -> {
            // heavy snow
            mainFragment?.setWeatherData(PrecipType.SNOW)
            R.drawable.ic_snow_cloud
        }
        "611" -> {
            // sleet
            mainFragment?.setWeatherData(PrecipType.SNOW)
            R.drawable.ic_snow_cloud
        }
        "612" -> {
            // shower sleet
            mainFragment?.setWeatherData(PrecipType.SNOW)
            R.drawable.ic_snow_cloud
        }
        "615" -> {
            // light rain and snow
            mainFragment?.setWeatherData(PrecipType.SNOW)
            R.drawable.ic_snow_cloud
        }
        "616" -> {
            // rain and snow
            mainFragment?.setWeatherData(PrecipType.SNOW)
            R.drawable.ic_snow_cloud
        }
        "620" -> {
            // light shower snow
            mainFragment?.setWeatherData(PrecipType.SNOW)
            R.drawable.ic_snow_cloud
        }
        "621" -> {
            // shower snow
            mainFragment?.setWeatherData(PrecipType.SNOW)
            R.drawable.ic_snow_cloud
        }
        "622" -> {
            // heavy shower snow
            mainFragment?.setWeatherData(PrecipType.SNOW)
            R.drawable.ic_snow_cloud
        }

    /*** Atmosphere **/
        "701" -> {
            // mist
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }
        "711" -> {
            // smoke
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }
        "721" -> {
            // haze
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }
        "731" -> {
            // sand, dust whirls
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }
        "741" -> {
            // fog
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }
        "751" -> {
            // sand
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }
        "761" -> {
            // dust
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }
        "762" -> {
            // volcanic ash
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_erupting_volcano
        }
        "771" -> {
            // squalls
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_tornado_weather_symbol_of_interface
        }
        "781" -> {
            // tornado
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_tornado_weather_symbol_of_interface
        }

    /*** Clear **/
        "800" -> {
            // clear sky
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_sun_black_symboi
        }

    /*** Clouds **/

        "801" -> {
            // few clouds
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }
        "802" -> {
            // scattered clouds
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }
        "803" -> {
            // broken clouds
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }
        "804" -> {
            // overcast clouds
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }

    /*** Extreme **/
        "900" -> {
            // tornado
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_tornado_weather_symbol_of_interface
        }
        "901" -> {
            // tropical storm
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_cloud_with_electrical_lightning_storm
        }
        "902" -> {
            // hurricane
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_tornado_weather_symbol_of_interface
        }
        "903" -> {
            // cold
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_snowflake
        }
        "904" -> {
            // hot
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_sun_black_symboi
        }
        "905" -> {
            // windy
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }
        "906" -> {
            // hail
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }

    /*** Additional **/
        "951" -> {
            // calm
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_sea
        }
        "952" -> {
            // light breeze
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_rain_cloud_black
        }
        "953" -> {
            // gentle breeze
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_rain_cloud_black
        }
        "954" -> {
            // moderate breeze
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_rain_cloud_black
        }
        "955" -> {
            // fresh breeze
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_rain_cloud_black
        }
        "956" -> {
            // strong breeze
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_rain_cloud_black
        }
        "957" -> {
            // high wind, near gale
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }
        "958" -> {
            // gale
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }
        "959" -> {
            // severe gale
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_foggy
        }
        "960" -> {
            // storm
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_tornado_weather_symbol_of_interface
        }
        "961" -> {
            // violent storm
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_tornado_weather_symbol_of_interface
        }
        "962" -> {
            // hurricane
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_tornado_weather_symbol_of_interface
        }

        else -> {
            mainFragment?.setWeatherData(PrecipType.CLEAR)
            R.drawable.ic_sun_black_symboi
        }
    }
}