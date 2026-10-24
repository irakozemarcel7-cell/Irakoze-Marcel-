package com.example.data.repository

import com.example.data.local.FavoriteDao
import com.example.data.local.FavoriteEntity
import com.example.data.local.WorkoutLogDao
import com.example.data.local.WorkoutLogEntity
import kotlinx.coroutines.flow.Flow

class WorkoutRepository(
    private val workoutLogDao: WorkoutLogDao,
    private val favoriteDao: FavoriteDao
) {
    val allLogs: Flow<List<WorkoutLogEntity>> = workoutLogDao.getAllLogs()
    val totalWorkouts: Flow<Int> = workoutLogDao.getWorkoutCount()
    val allFavorites: Flow<List<FavoriteEntity>> = favoriteDao.getAllFavorites()

    fun isFavorite(id: String): Flow<Boolean> = favoriteDao.isFavorite(id)

    suspend fun saveWorkout(exerciseName: String, reps: Int, durationSeconds: Int, notes: String = "") {
        workoutLogDao.insertLog(
            WorkoutLogEntity(
                exerciseName = exerciseName,
                repsDone = reps,
                durationSeconds = durationSeconds,
                notes = notes
            )
        )
    }

    suspend fun deleteWorkout(id: Int) {
        workoutLogDao.deleteLogById(id)
    }

    suspend fun toggleFavorite(id: String, type: String, title: String, subtitle: String, isCurrentlyFavorite: Boolean) {
        if (isCurrentlyFavorite) {
            favoriteDao.deleteFavoriteById(id)
        } else {
            favoriteDao.insertFavorite(
                FavoriteEntity(
                    id = id,
                    type = type,
                    title = title,
                    subtitle = subtitle
                )
            )
        }
    }
}
