package com.paryavaran.kavalu.data.database

import androidx.room.TypeConverter
import com.paryavaran.kavalu.data.database.entities.ReportStatus

class Converters {
    @TypeConverter
    fun toStatus(value: String): ReportStatus = ReportStatus.valueOf(value)

    @TypeConverter
    fun fromStatus(status: ReportStatus): String = status.name
}
