package com.quixom.apps.weatherstream.utilities

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v4.app.NotificationCompat
import android.widget.RemoteViews
import com.quixom.apps.weatherstream.MainActivity
import com.quixom.apps.weatherstream.R

/**
 * Created by akif on 11/8/17.
 */

class LocalNotification(val mainActivity: MainActivity) {

    /***
     * Build local notification for showing weather
     */
    @RequiresApi(Build.VERSION_CODES.N)
    fun showCustomLayoutHeadsUpNotification(context: Context, title: String, message: String, time: String, weatherTypeImage: Int) {

        val remoteViews = createRemoteViews(context, R.layout.notification_custom_content, title, message, time, weatherTypeImage)

        val notificationIntent = Intent(Intent.ACTION_VIEW)
        notificationIntent.data = Uri.parse("")
        val contentIntent = PendingIntent.getActivity(context, 0, notificationIntent, 0)

        val builder = NotificationCompat.Builder(context, "ws1")
        builder.setContent(remoteViews)
                .setStyle(NotificationCompat.DecoratedCustomViewStyle())
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setVibrate(LongArray(0))
                .setSmallIcon(weatherTypeImage)
                .setColor(Color.parseColor("#ffffff"))
                .setContentIntent(contentIntent)
                .setAutoCancel(true)

        val push = Intent()
        push.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        push.setClass(context, MainActivity::class.java)

        val fullScreenPendingIntent = PendingIntent.getActivity(context, 0, push, PendingIntent.FLAG_CANCEL_CURRENT)
        builder.setFullScreenIntent(fullScreenPendingIntent, true)
        showNotification(context, builder.build(), 0)
    }

    private fun createRemoteViews(context: Context, layout: Int, title: String, message: String, time: String, weatherTypeImage: Int): RemoteViews {
        val remoteViews = RemoteViews(context.packageName, layout)
        remoteViews.setTextViewText(R.id.text_title, title)
        remoteViews.setTextViewText(R.id.text_message, message)
        remoteViews.setTextViewText(R.id.text_time, time)
        remoteViews.setImageViewResource(R.id.ivWeatherTypeNotification, weatherTypeImage)
        return remoteViews
    }

    private fun showNotification(context: Context, notification: Notification, id: Int) {
        val mNotificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        mNotificationManager.notify(id, notification)
    }
}