package com.quixom.apps.weatherstream.adapters

import android.content.Context
import android.graphics.DashPathEffect
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
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
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.expandablerecyclerview.ExpandableItem
import com.quixom.apps.weatherstream.expandablerecyclerview.ExpandableRecyclerView
import com.quixom.apps.weatherstream.model.WeatherViewItem
import java.util.*


/**
 * Created by akif on 11/3/17.
 */
class ItemAdapter(layout: LinearLayoutManager, recyclerView: ExpandableRecyclerView, mainActivity: MainActivity) : ExpandableRecyclerView.Adapter<ItemAdapter.ViewHolder>(layout) {

    private var context: Context? = null
    private var mActivity: MainActivity? = mainActivity
    private val items = arrayOf(
            WeatherViewItem(R.drawable.honey_dew, "14 Easy Weekend Getaways"),
            WeatherViewItem(R.drawable.honey_dew, "Why We Travel"),
            WeatherViewItem(R.drawable.honey_dew, "A Paris Farewell"),
            WeatherViewItem(R.drawable.honey_dew, "14 Easy Weekend Getaways"),
            WeatherViewItem(R.drawable.honey_dew, "Why We Travel"),
            WeatherViewItem(R.drawable.honey_dew, "A Paris Farewell"),
            WeatherViewItem(R.drawable.honey_dew, "14 Easy Weekend Getaways"),
            WeatherViewItem(R.drawable.honey_dew, "Why We Travel"),
            WeatherViewItem(R.drawable.honey_dew, "A Paris Farewell"),
            WeatherViewItem(R.drawable.honey_dew, "14 Easy Weekend Getaways"),
            WeatherViewItem(R.drawable.honey_dew, "Why We Travel"),
            WeatherViewItem(R.drawable.honey_dew, "A Paris Farewell")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ViewHolder {
        context = parent.context
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.view_row, parent, false), mActivity!!)
    }

    override fun onBindViewHolder(holder: ItemAdapter.ViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        val drawable = items[position].drawable
        val title = items[position].title


        setData(10, 100f, holder.temperatureGraph)

        dummyWeatherPredictionData(holder, mActivity!!)
        holder.textView.text = title
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(itemView: View, mActivity: MainActivity) : RecyclerView.ViewHolder(itemView) {
        val item: ExpandableItem = itemView.findViewById(R.id.row)
        val textView: TextView = item.headerLayout.findViewById(R.id.textView)
        val rvDaysPredictionList: RecyclerView = item.findViewById(R.id.rvDaysPredictionList)
        val temperatureGraph: LineChart = item.findViewById(R.id.temperature_graph)
    }

    fun dummyWeatherPredictionData(holder: ItemAdapter.ViewHolder, mainActivity: MainActivity) {
        val lists = ArrayList<WeatherViewItem>()
        for (i in 1..8) {
            lists.add(WeatherViewItem(R.drawable.ic_snow_storm_day_winter_weather, "10 AM"))
        }
        val layoutManager = LinearLayoutManager(mainActivity, LinearLayoutManager.HORIZONTAL, true)
        holder.rvDaysPredictionList.layoutManager = layoutManager
        holder.rvDaysPredictionList.adapter = WeatherPredictionAdapter(lists, mainActivity)
        holder.rvDaysPredictionList.scrollToPosition(0)
    }

    /***
     * Method for set temperature data on Graph
     * */
    private fun setData(count: Int, range: Float, mChart: LineChart) {

        val values = ArrayList<Entry>()

        for (i in 0 until count) {

            val `val` = (Math.random() * range).toFloat() + 3
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