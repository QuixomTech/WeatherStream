package com.quixom.apps.weatherstream.adapters

import android.annotation.SuppressLint
import android.os.Handler
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.quixom.apps.weatherstream.MainActivity
import com.quixom.apps.weatherstream.Methods
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.model.LocationSearchHistory
import com.quixom.apps.weatherstream.utilities.PreferenceUtil
import com.quixom.apps.weatherstream.utilities.WeatherToImage
import java.util.*

/**
 * Created by akif on 11/3/17.
 */

class LocationHistoryAdapter(internal var preferenceUtil: PreferenceUtil, internal var appslist: ArrayList<LocationSearchHistory>, internal var sActivity: MainActivity) : RecyclerView.Adapter<LocationHistoryAdapter.LocationVH>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): LocationHistoryAdapter.LocationVH {
        val itemView = LayoutInflater.from(sActivity).inflate(R.layout.row_menu_view, parent, false)
        return LocationVH(itemView)
    }

    override fun onBindViewHolder(holder: LocationHistoryAdapter.LocationVH?, position: Int) {
        holder?.bindData(appslist[position])
        val locationDataList: LocationSearchHistory = LocationSearchHistory.getLocationInfo(appslist[position].cityName!!, appslist[position].countyName!!)

        holder?.itemView?.setOnClickListener(View.OnClickListener {
            sActivity.slidingMenuLeft?.showContent(true)
            Handler().postDelayed({
                sActivity.callSearchLocationApi(locationDataList.lat!!, locationDataList.lon!!)
            }, 500)
        })
    }

    override fun getItemCount(): Int = appslist.size

    inner class LocationVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("SetTextI18n")
        fun bindData(locationSearchData: LocationSearchHistory) {

            val ivWeatherType: ImageView = itemView.findViewById(R.id.ivWeatherTypeMV)
            val tvCityName: TextView = itemView.findViewById(R.id.tvCityNameMV)
            val tvCountryName: TextView = itemView.findViewById(R.id.tvCountryNameMV)
            val tvTemperature: TextView = itemView.findViewById(R.id.tvTemperatureMV)

            tvCityName.text = locationSearchData.cityName

            if (locationSearchData.countyName != null) {
                val loc = Locale("", locationSearchData.countyName)
                tvCountryName.text = loc.displayCountry
            }

            if (!preferenceUtil.getBooleanPref(preferenceUtil.IS_APP_THEME_DAY)) {
                tvCityName.setTextColor(ContextCompat.getColor(sActivity, R.color.font_white_trans))
                tvCountryName.setTextColor(ContextCompat.getColor(sActivity, R.color.font_white))
            }

            if (preferenceUtil.getBooleanPref(preferenceUtil.IS_TEMPERATURE_UNIT_CELCIUS)) {
                tvTemperature.text = Math.round(locationSearchData.temperature!!).toString().plus(sActivity.resources.getString(R.string.c_symbol))
            } else {
                tvTemperature.text = Math.round(Methods.convertCelsiusToFahrenheit(locationSearchData.temperature?.toFloat()!!)).toString().plus(sActivity.resources.getString(R.string.f_symbol))
            }

            ivWeatherType.setImageResource(WeatherToImage.getWeatherTypeConditionCode(null, null, locationSearchData.weatherType.toString()))

        }
    }
}