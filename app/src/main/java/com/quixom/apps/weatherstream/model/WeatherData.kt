package com.quixom.apps.weatherstream.model

import com.google.gson.annotations.Expose

/**
* Created by akif on 11/9/17.
*/
/*
data class WeatherData(
        val id: Long,
        val dt: Long,
        val clouds: Clouds,
        val coord: Coord,
        val wind: Wind,
        val cod: Long,
        val visibility: Long,
        val sys: Sys,
        val name: String,
        val base: String,
        val weather: Weather,
        val main: Main
) : Serializable

data class Clouds(
        val all: String
) : Serializable

data class Coord(
        val lon: Double,
        val lat: Double
) : Serializable

data class Wind(
        val speed: Double,
        val deg: Int
) : Serializable

data class Sys(
        val message: String,
        val id: Long,
        val sunrise: Long,
        val sunset: Long,
        val type: Int,
        val country: String
) : Serializable

data class Weather(
        val id: Long,
        val icon: String,
        val description: String,
        val main: String
) : Serializable

data class Main(
        val humidity: Long,
        val pressure: Long,
        val temp_max: Double,
        val temp_min: Double,
        val temp: Double
) : Serializable*/
class WeatherData {

    @Expose
    private var id: String? = null
    @Expose
    private var dt: String? = null
    @Expose
    private var clouds: Clouds? = null
    @Expose
    private var coord: Coord? = null
    @Expose
    private var wind: Wind? = null
    @Expose
    private var cod: String? = null
    @Expose
    private var visibility: String? = null
    @Expose
    private var sys: Sys? = null
    @Expose
    private var name: String? = null
    @Expose
    private var base: String? = null
    @Expose
    private var weather: Array<Weather>? = null
    @Expose
    private var main: Main? = null

    fun getId(): String? {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }

    fun getDt(): String? {
        return dt
    }

    fun setDt(dt: String) {
        this.dt = dt
    }

    fun getClouds(): Clouds? {
        return clouds
    }

    fun setClouds(clouds: Clouds) {
        this.clouds = clouds
    }

    fun getCoord(): Coord? {
        return coord
    }

    fun setCoord(coord: Coord) {
        this.coord = coord
    }

    fun getWind(): Wind? {
        return wind
    }

    fun setWind(wind: Wind) {
        this.wind = wind
    }

    fun getCod(): String? {
        return cod
    }

    fun setCod(cod: String) {
        this.cod = cod
    }

    fun getVisibility(): String? {
        return visibility
    }

    fun setVisibility(visibility: String) {
        this.visibility = visibility
    }

    fun getSys(): Sys? {
        return sys
    }

    fun setSys(sys: Sys) {
        this.sys = sys
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getBase(): String? {
        return base
    }

    fun setBase(base: String) {
        this.base = base
    }

    fun getWeather(): Array<Weather>? {
        return weather
    }

    fun setWeather(weather: Array<Weather>) {
        this.weather = weather
    }

    fun getMain(): Main? {
        return main
    }

    fun setMain(main: Main) {
        this.main = main
    }

    class Clouds {
        private var all: String? = null

        fun getAll(): String? {
            return all
        }

        fun setAll(all: String) {
            this.all = all
        }
    }

    class Coord {
        @Expose
        private var lon: String? = null
        @Expose
        private var lat: String? = null

        fun getLon(): String? {
            return lon
        }

        fun setLon(lon: String) {
            this.lon = lon
        }

        fun getLat(): String? {
            return lat
        }

        fun setLat(lat: String) {
            this.lat = lat
        }
    }

    class Wind {
        @Expose
        private var speed: String? = null
        @Expose
        private var deg: String? = null

        fun getSpeed(): String? {
            return speed
        }

        fun setSpeed(speed: String) {
            this.speed = speed
        }

        fun getDeg(): String? {
            return deg
        }

        fun setDeg(deg: String) {
            this.deg = deg
        }
    }

    class Sys {
        @Expose
        private var message: String? = null
        @Expose
        private var id: String? = null
        @Expose
        private var sunset: String? = null
        @Expose
        private var sunrise: String? = null
        @Expose
        private var type: String? = null

        private var country: String? = null

        fun getMessage(): String? {
            return message
        }

        fun setMessage(message: String) {
            this.message = message
        }

        fun getId(): String? {
            return id
        }

        fun setId(id: String) {
            this.id = id
        }

        fun getSunset(): String? {
            return sunset
        }

        fun setSunset(sunset: String) {
            this.sunset = sunset
        }

        fun getSunrise(): String? {
            return sunrise
        }

        fun setSunrise(sunrise: String) {
            this.sunrise = sunrise
        }

        fun getType(): String? {
            return type
        }

        fun setType(type: String) {
            this.type = type
        }

        fun getCountry(): String? {
            return country
        }

        fun setCountry(country: String) {
            this.country = country
        }
    }

    class Weather {
        @Expose
        private var id: String? = null
        @Expose
        private var icon: String? = null
        @Expose
        private var description: String? = null
        @Expose
        private var main: String? = null

        fun getId(): String? {
            return id
        }

        fun setId(id: String) {
            this.id = id
        }

        fun getIcon(): String? {
            return icon
        }

        fun setIcon(icon: String) {
            this.icon = icon
        }

        fun getDescription(): String? {
            return description
        }

        fun setDescription(description: String) {
            this.description = description
        }

        fun getMain(): String? {
            return main
        }

        fun setMain(main: String) {
            this.main = main
        }
    }

    class Main {
        @Expose
        private var humidity: String? = null
        @Expose
        private var pressure: String? = null
        @Expose
        private var temp_max: String? = null
        @Expose
        private var temp_min: String? = null
        @Expose
        private var temp: String? = null

        fun getHumidity(): String? {
            return humidity
        }

        fun setHumidity(humidity: String) {
            this.humidity = humidity
        }

        fun getPressure(): String? {
            return pressure
        }

        fun setPressure(pressure: String) {
            this.pressure = pressure
        }

        fun getTemp_max(): String? {
            return temp_max
        }

        fun setTemp_max(temp_max: String) {
            this.temp_max = temp_max
        }

        fun getTemp_min(): String? {
            return temp_min
        }

        fun setTemp_min(temp_min: String) {
            this.temp_min = temp_min
        }

        fun getTemp(): String? {
            return temp
        }

        fun setTemp(temp: String) {
            this.temp = temp
        }
    }
}