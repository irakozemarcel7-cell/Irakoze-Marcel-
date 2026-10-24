package com.example.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "workout_logs")
data class WorkoutLogEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val exerciseName: String,
    val repsDone: Int,
    val durationSeconds: Int,
    val timestamp: Long = System.currentTimeMillis(),
    val notes: String = ""
)

@Entity(tableName = "favorites")
data class FavoriteEntity(
    @PrimaryKey
    val id: String, // e.g. "EX_1" or "TIP_23"
    val type: String, // "EXERCISE" or "TIP"
    val title: String,
    val subtitle: String,
    val timestamp: Long = System.currentTimeMillis()
)
