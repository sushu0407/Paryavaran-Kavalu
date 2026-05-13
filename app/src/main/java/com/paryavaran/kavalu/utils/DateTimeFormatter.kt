package com.paryavaran.kavalu.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlin.math.max

object DateTimeFormatter {
    fun getTimeAgo(timestamp: Long): String {
        val seconds = max(1, (System.currentTimeMillis() - timestamp) / 1000)
        return when {
            seconds < 60 -> "just now"
            seconds < 3600 -> "${seconds / 60} min ago"
            seconds < 86400 -> "${seconds / 3600} hours ago"
            seconds < 604800 -> "${seconds / 86400} days ago"
            else -> SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(Date(timestamp))
        }
    }

    fun monthYear(timestamp: Long): String =
        SimpleDateFormat("MMM yyyy", Locale.getDefault()).format(Date(timestamp))
}
