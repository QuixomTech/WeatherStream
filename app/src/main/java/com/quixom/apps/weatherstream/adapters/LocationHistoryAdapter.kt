package com.quixom.apps.weatherstream.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.quixom.apps.weatherstream.MainActivity
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.model.LocationSearchHistory

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
    }

    override fun getItemCount(): Int = appslist.size


    inner class LocationVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(locationSearchData: LocationSearchHistory) {

            val ivWeatherType: ImageView = itemView.findViewById(R.id.ivWeatherTypeMV)
            val tvCityName: TextView = itemView.findViewById(R.id.tvCityNameMV)
            val tvCountryName: TextView = itemView.findViewById(R.id.tvCountryNameMV)
            val tvTemperature: TextView = itemView.findViewById(R.id.tvTemperatureMV)

            tvCityName.text = locationSearchData.cityName
            tvCountryName.text = locationSearchData.countyName
            tvTemperature.text = locationSearchData.temperature.toString()
        }
    }
}