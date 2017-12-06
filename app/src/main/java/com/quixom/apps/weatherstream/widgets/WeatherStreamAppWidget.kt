package com.quixom.apps.weatherstream.widgets

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.RemoteViews
import com.quixom.apps.weatherstream.R
import com.quixom.apps.weatherstream.activity.SplashActivity
import com.quixom.apps.weatherstream.model.WeatherData
import com.quixom.apps.weatherstream.services.WeatherWidgetService


/**
* Created by akif on 12/5/17.
*/
class WeatherStreamAppWidget : AppWidgetProvider() {

    override fun onUpdate(context: Context?, appWidgetManager: AppWidgetManager?, appWidgetIds: IntArray?) {
        super.onUpdate(context, appWidgetManager, appWidgetIds)
        println("OnUpdated == ")
        updateAppWidget(context, appWidgetManager)
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        super.onReceive(context, intent)
        println("onReceive == ")

        val appWidgetManager = AppWidgetManager.getInstance(context?.applicationContext)
        val thisWidget = ComponentName(context?.applicationContext, WeatherStreamAppWidget::class.java)
        val appWidgetIds = appWidgetManager.getAppWidgetIds(thisWidget)

        val remoteViews = RemoteViews(context?.packageName, R.layout.weather_forecasting_app_widget)
        val weatherData = WeatherData.getLocationBasedWeatherDetails()

        if (appWidgetIds != null && appWidgetIds.isNotEmpty()) {
            if (weatherData != null) {
                onUpdate(context, appWidgetManager, appWidgetIds)
            } else {
                remoteViews.setViewVisibility(R.id.tvNoDataFound, View.VISIBLE)
                for (widgetId in appWidgetIds) {
                    appWidgetManager.updateAppWidget(widgetId, remoteViews)
                }
            }
        }
    }

    /***
     * Method for update data of widget.
     * @param context: Context of app
     * @param appWidgetManager: Instance of AppWidgetManager
     *
     * */
    private fun updateAppWidget(context: Context?, appWidgetManager: AppWidgetManager?) {
        val thisWidget = ComponentName(context, WeatherStreamAppWidget::class.java)
        val allWidgetIds = appWidgetManager?.getAppWidgetIds(thisWidget)
        val remoteViews = RemoteViews(context?.packageName, R.layout.weather_forecasting_app_widget)
        remoteViews.setViewVisibility(R.id.tvNoDataFound, View.GONE)

        println("service called" )

        val intent = Intent(context?.applicationContext, WeatherWidgetService::class.java)
        intent.action = AppWidgetManager.ACTION_APPWIDGET_UPDATE
        intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, allWidgetIds)

        context?.stopService(intent)
        context?.startService(intent)

        val splashIntent = Intent(context, SplashActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(context, 0, splashIntent, 0)
        remoteViews.setOnClickPendingIntent(R.id.flwidgetParent, pendingIntent)
        for (appWidgetIds in allWidgetIds!!) {
            appWidgetManager.updateAppWidget(appWidgetIds, remoteViews)
        }
    }

    override fun onDeleted(context: Context?, appWidgetIds: IntArray?) {
        super.onDeleted(context, appWidgetIds)
        val intent = Intent(context, WeatherWidgetService::class.java)
        context?.stopService(intent)
    }
}