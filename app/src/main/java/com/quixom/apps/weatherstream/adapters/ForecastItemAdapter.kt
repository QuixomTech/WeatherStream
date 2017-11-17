package com.quixom.apps.weatherstream.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.DashPathEffect
import android.support.design.widget.BottomSheetDialog
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import com.quixom.apps.weatherstream.MainActivity
import com.quixom.apps.weatherstream.Methods
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.model.WeatherData
import com.quixom.apps.weatherstream.model.WeatherForecastData
import com.quixom.apps.weatherstream.utilities.DateUtil
import java.util.*






/**
* Created by akif on 11/3/17.
*/
class ForecastItemAdapter(private var daysForecastList: List<WeatherForecastData.ForecastList>, mainActivity: MainActivity) : RecyclerView.Adapter<ForecastItemAdapter.ViewHolder>() {

    private var context: Context? = null
    private var mActivity: MainActivity? = mainActivity

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastItemAdapter.ViewHolder {
        context = parent.context
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_forecast_item_view, parent, false), mActivity!!)
    }

    @SuppressLint("InflateParams")
    override fun onBindViewHolder(holder: ForecastItemAdapter.ViewHolder, position: Int) {
        val drawable = R.drawable.honey_dew
        val dateTime = daysForecastList[position].dt_txt
        val dateValue = daysForecastList[position].dt

        holder.tvDayTime.text = DateUtil.getDateFromMillis(dateValue, DateUtil.dateDisplayFormat3).plus(" ").plus(DateUtil.convertTime(dateTime!!))

        if (DateUtil.getCurrentDateTime(dateTime)) {
            holder.tvDayTime.background = ContextCompat.getDrawable(mActivity, R.drawable.day_status_active)
        } else {
            holder.tvDayTime.background = ContextCompat.getDrawable(mActivity, R.drawable.day_status_pendding)
        }

        val mainWeatherData: List<WeatherData.Main>? = WeatherData.Main.getMainWeatherList()
        if (mainWeatherData != null) {
            val avgTemp = mainWeatherData[position+1].temp
            val minTemp = mainWeatherData[position+1].temp_min
            val maxTemp = mainWeatherData[position+1].temp_max
            var humidity = mainWeatherData[position+1].humidity

            if (avgTemp != null && minTemp != null && maxTemp != null) {
                holder.tvAvgTemperature.text = Math.round(avgTemp.toDouble()).toString().plus(mActivity?.resources?.getString(R.string.temp_degree_sign))
                holder.tvMinMaxTempExpand.text = Math.round(minTemp.toDouble()).toString().plus(mActivity?.resources?.getString(R.string.temp_degree_sign)).
                        plus("/").plus(Math.round(maxTemp.toDouble()).toString()).plus(mActivity?.resources?.getString(R.string.temp_degree_sign))
            }
        }

        holder.itemView.setOnClickListener(View.OnClickListener {
            Methods.avoidDoubleClicks(holder.itemView)
            val mBottomSheetDialog = BottomSheetDialog(context!!)
            val sheetView = mActivity?.layoutInflater?.inflate(R.layout.bottomsheet_weather_details, null)
            mBottomSheetDialog.setContentView(sheetView)
            mBottomSheetDialog.show()
        })

      /*  mBottomSheetDialog.setOnDismissListener {
            Toast.makeText(mActivity, "test", Toast.LENGTH_SHORT).show()
        }*/
    }

    override fun getItemCount(): Int = daysForecastList.size

    class ViewHolder(itemView: View, mActivity: MainActivity) : RecyclerView.ViewHolder(itemView) {

        val tvDayTime: TextView = itemView.findViewById(R.id.tvDayTime)
        val tvMinMaxTempExpand: TextView = itemView.findViewById(R.id.tvMinMaxTempExpand)
        val tvAvgTemperature: TextView = itemView.findViewById(R.id.tvAvgTemperature)
    }

    /***
     * Method for set temperature data on Graph
     * */
    private fun setGraphData(count: Int, range: Float, mChart: LineChart) {

        val values = ArrayList<Entry>()

        for (i in 0 until count) {

            val `val` = (Math.random() * range).toFloat()
            values.add(Entry(i.toFloat(), `val`))
        }

        val set1: LineDataSet

        if (mChart.data != null && mChart.data.dataSetCount > 0) {
            set1 = mChart.data.getDataSetByIndex(0) as LineDataSet
            set1.values = values
            mChart.data.notifyDataChanged()
            mChart.notifyDataSetChanged()
        } else {
            // create a dataset and give it a type
            set1 = LineDataSet(values, "")

            set1.setDrawIcons(false)
            set1.isDrawCirclesEnabled

            // set the line to be drawn like this "- - - - - -"
            set1.enableDashedLine(10f, 5f, 0f)
            set1.enableDashedHighlightLine(10f, 5f, 0f)
            set1.color = ContextCompat.getColor(mActivity, R.color.frag2)
            set1.mode = LineDataSet.Mode.CUBIC_BEZIER
            set1.setCircleColor(ContextCompat.getColor(mActivity, R.color.colorAccent))
            set1.lineWidth = 1f
            set1.circleRadius = 3f
            set1.setDrawCircleHole(false)
            set1.valueTextSize = 9f
            set1.setDrawFilled(true)
            set1.disableDashedLine()
            set1.valueTextColor = ContextCompat.getColor(mActivity, R.color.font_white)
            set1.isHighlightEnabled = false
            set1.formLineWidth = 1f
            set1.formLineDashEffect = DashPathEffect(floatArrayOf(10f, 5f), 0f)
            set1.formSize = 15f

            set1.isHighlightEnabled = false
            set1.fillDrawable = ContextCompat.getDrawable(mActivity, R.drawable.honey_dew)

            val dataSets = ArrayList<ILineDataSet>()
            dataSets.add(set1) // add the datasets

            // create a data object with the datasets
            val data = LineData(dataSets)

            // set data
            mChart.data = data
            mChart.setPinchZoom(false)
            mChart.isVerticalFadingEdgeEnabled = false
            mChart.axisLeft.setDrawGridLines(false)
            mChart.axisRight.setDrawGridLines(false)
            mChart.xAxis.setDrawGridLines(false)
            mChart.xAxis.textColor = ContextCompat.getColor(mActivity, R.color.font_white)
            mChart.xAxis.position = XAxis.XAxisPosition.BOTTOM
            mChart.xAxis.textSize
            mChart.legend.isEnabled = false
            mChart.description.isEnabled = false
            mChart.xAxis.setDrawAxisLine(false)
            mChart.xAxis.mLabelHeight = 50
            mChart.axisLeft.setDrawLabels(false)
            mChart.axisRight.setDrawLabels(false)
            mChart.axisRight.setDrawAxisLine(false)
            mChart.axisLeft.setDrawAxisLine(false)
            mChart.xAxis.gridColor = ContextCompat.getColor(mActivity, R.color.transparent_bg)
            mChart.isClickable = false
        }
    }
}