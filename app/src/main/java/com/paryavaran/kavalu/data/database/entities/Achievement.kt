package com.paryavaran.kavalu.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "achievements")
data class Achievement(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "icon")
    val icon: String,
    @ColumnInfo(name = "is_unlocked")
    val isUnlocked: Boolean = false,
    @ColumnInfo(name = "unlock_date")
    val unlockDate: Long? = null,
    @ColumnInfo(name = "required_points")
    val requiredPoints: Int
)
