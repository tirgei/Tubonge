package com.gelostech.tubonge.utils

import android.text.format.DateUtils
import com.kizitonwose.time.hours
import java.text.SimpleDateFormat
import java.util.*

class TimeFormatter {

    private var timeFormat = SimpleDateFormat("h:mm a", Locale.getDefault())
    private var normalYearFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())

    fun getChatTimeStamp(time: Long): String {
        val currentTime = System.currentTimeMillis()
        val timeDifference = getTimeDifference(currentTime, time)
        val formattedTime: String

        formattedTime = when {
            timeDifference <= 12.hours.inMilliseconds.longValue -> getTime(time)
            isYesterday(time) -> "Yesterday"
            else -> getNormalYear(time)
        }

        return formattedTime
    }

    fun getTime(millis: Long): String {
        return timeFormat.format(millis)
    }

    fun getNormalYear(millis: Long): String {
        return normalYearFormat.format(millis)
    }

    private fun getTimeDifference(currentTime: Long, postTime: Long) = currentTime - postTime

    private fun isYesterday(millis: Long): Boolean {
        return DateUtils.isToday(millis + DateUtils.DAY_IN_MILLIS)
    }

}