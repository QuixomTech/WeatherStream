package com.quixom.apps.weatherstream.adapters

import android.annotation.SuppressLint
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.quixom.apps.weatherstream.MainActivity
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.model.LocationSearchHistory
import java.util.*

/**
* Created by akif on 11/3/17.
*/

class LocationHistoryAdapter(internal var appslist: ArrayList<LocationSearchHistory>, internal var sActivity: MainActivity) : RecyclerView.Adapter<LocationHistoryAdapter.LocationVH>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): LocationHistoryAdapter.LocationVH {
        val itemView = LayoutInflater.from(sActivity).inflate(R.layout.row_menu_view, parent, false)
        return LocationVH(itemView)
    }

    override fun onBindViewHolder(holder: LocationHistoryAdapter.LocationVH?, position: Int) {
        holder?.bindData(appslist[position])
        val locationDataList: LocationSearchHistory = LocationSearchHistory.getLocationInfo(appslist[position].cityName!!, appslist[position].countyName!!)

        holder?.itemView?.setOnClickListener(View.OnClickListener {
            if (locationDataList  != null) {
                sActivity.toggleSlideMenuLeft()
                sActivity.callSearchLocationApi(locationDataList.lat!!, locationDataList.lon!!)
            }
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
            val loc = Locale("", locationSearchData.countyName)
            tvCountryName.text = loc.displayCountry
            tvTemperature.text = Math.round(locationSearchData.temperature!!).toString().plus(sActivity.resources.getString(R.string.c_symbol))
        }
    }
}