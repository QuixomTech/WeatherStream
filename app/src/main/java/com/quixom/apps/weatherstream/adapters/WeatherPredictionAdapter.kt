package com.quixom.apps.weatherstream.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.quixom.apps.weatherstream.MainActivity
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.model.WeatherViewItem

/**
 * Created by akif on 11/4/17.
 */
class WeatherPredictionAdapter(internal var weatherList: ArrayList<WeatherViewItem>, internal var mainActivity: MainActivity) : RecyclerView.Adapter<WeatherPredictionAdapter.WeatherPredicationVH>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): WeatherPredicationVH {
        val itemView = LayoutInflater.from(mainActivity).inflate(R.layout.view_horizontal_row, parent, false)
        return WeatherPredicationVH(itemView)
    }

    override fun onBindViewHolder(holder: WeatherPredicationVH?, position: Int) {
        holder?.bindData(weatherList[position])
    }

    override fun getItemCount(): Int = weatherList.size

    class WeatherPredicationVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(weatherP: WeatherViewItem) {
            val tvTimeHorizontal: TextView = itemView.findViewById(R.id.tvTimeHorizontal)
            val ivWeatherTypeHorizontal: ImageView = itemView.findViewById(R.id.ivWeatherTypeHorizontal)

            tvTimeHorizontal.text = weatherP.title
            ivWeatherTypeHorizontal.setImageResource(weatherP.drawable)
        }
    }
}