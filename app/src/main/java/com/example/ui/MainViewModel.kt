package com.example.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.local.AppDatabase
import com.example.data.local.FavoriteEntity
import com.example.data.local.WorkoutLogEntity
import com.example.data.model.Exercise
import com.example.data.model.HealthTip
import com.example.data.repository.ExerciseRepository
import com.example.data.repository.HealthTipRepository
import com.example.data.repository.WorkoutRepository
import com.example.util.NetworkObserver
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

enum class ScreenTab {
    HOME,
    EXERCISES,
    NUTRITION,
    PROGRAMS,
    TOOLS,
    HISTORY_FAVORITES,
    PWA_INFO
}

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val db = AppDatabase.getDatabase(application)
    private val repository = WorkoutRepository(db.workoutLogDao(), db.favoriteDao())
    private val networkObserver = NetworkObserver(application)

    // Navigation state
    private val _currentTab = MutableStateFlow(ScreenTab.HOME)
    val currentTab: StateFlow<ScreenTab> = _currentTab.asStateFlow()

    fun setTab(tab: ScreenTab) {
        _currentTab.value = tab
    }

    // Network connectivity state
    val isOnline: StateFlow<Boolean> = networkObserver.isOnline
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), false)

    // Update check modal state
    private val _updateCheckMessage = MutableStateFlow<String?>(null)
    val updateCheckMessage: StateFlow<String?> = _updateCheckMessage.asStateFlow()

    fun checkForUpdates() {
        viewModelScope.launch {
            if (isOnline.value) {
                _updateCheckMessage.value = "Kugenzura... Porogarama ifise verisiyo igezweho (v1.2.0 Hors-ligne)! Imyitozo 52 n'inama 100 biratunganijwe neza."
            } else {
                _updateCheckMessage.value = "Nta nterineti iriko irakora. Ntaco bitwaye! Ibintu vyose (imyitozo 52, inama 100, intunganyo) bikora 100% hors-ligne!"
            }
        }
    }

    fun dismissUpdateMessage() {
        _updateCheckMessage.value = null
    }

    // Room DB State
    val workoutLogs: StateFlow<List<WorkoutLogEntity>> = repository.allLogs
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val totalWorkouts: StateFlow<Int> = repository.totalWorkouts
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), 0)

    val allFavorites: StateFlow<List<FavoriteEntity>> = repository.allFavorites
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun toggleFavorite(id: String, type: String, title: String, subtitle: String) {
        viewModelScope.launch {
            val isFav = allFavorites.value.any { it.id == id }
            repository.toggleFavorite(id, type, title, subtitle, isFav)
        }
    }

    fun isFavorite(id: String): Boolean {
        return allFavorites.value.any { it.id == id }
    }

    // Exercise Screen filters & state
    val exerciseSearchQuery = MutableStateFlow("")
    val exerciseSelectedLevel = MutableStateFlow("Vyose")
    val exerciseSelectedMuscle = MutableStateFlow("Vyose")
    val selectedExerciseForDetail = MutableStateFlow<Exercise?>(null)

    // Health Tips Screen filters & state
    val tipSearchQuery = MutableStateFlow("")
    val tipSelectedCategory = MutableStateFlow("Vyose")
    val selectedTipForDetail = MutableStateFlow<HealthTip?>(null)

    // Stopwatch tool state
    private val _stopwatchSeconds = MutableStateFlow(0)
    val stopwatchSeconds: StateFlow<Int> = _stopwatchSeconds.asStateFlow()

    private val _isStopwatchRunning = MutableStateFlow(false)
    val isStopwatchRunning: StateFlow<Boolean> = _isStopwatchRunning.asStateFlow()

    private val _stopwatchLaps = MutableStateFlow<List<Int>>(emptyList())
    val stopwatchLaps: StateFlow<List<Int>> = _stopwatchLaps.asStateFlow()

    private var stopwatchJob: Job? = null

    fun toggleStopwatch() {
        if (_isStopwatchRunning.value) {
            _isStopwatchRunning.value = false
            stopwatchJob?.cancel()
        } else {
            _isStopwatchRunning.value = true
            stopwatchJob = viewModelScope.launch {
                while (_isStopwatchRunning.value) {
                    delay(1000)
                    _stopwatchSeconds.value += 1
                }
            }
        }
    }

    fun resetStopwatch() {
        _isStopwatchRunning.value = false
        stopwatchJob?.cancel()
        _stopwatchSeconds.value = 0
        _stopwatchLaps.value = emptyList()
    }

    fun addStopwatchLap() {
        val current = _stopwatchSeconds.value
        if (current > 0) {
            _stopwatchLaps.value = listOf(current) + _stopwatchLaps.value
        }
    }

    // Repetition counter tool state
    val repExerciseName = MutableStateFlow("Pompe zisanzwe")
    val currentReps = MutableStateFlow(0)
    val currentSets = MutableStateFlow(1)
    val targetReps = MutableStateFlow(15)

    fun incrementReps() {
        currentReps.value += 1
    }

    fun decrementReps() {
        if (currentReps.value > 0) {
            currentReps.value -= 1
        }
    }

    fun completeSet() {
        currentSets.value += 1
        currentReps.value = 0
    }

    fun resetRepCounter() {
        currentReps.value = 0
        currentSets.value = 1
    }

    fun saveWorkoutSession(notes: String = "") {
        viewModelScope.launch {
            val name = repExerciseName.value
            val reps = currentReps.value
            val duration = _stopwatchSeconds.value
            repository.saveWorkout(
                exerciseName = name,
                reps = if (reps > 0) reps else targetReps.value,
                durationSeconds = duration,
                notes = notes
            )
            // Feedback
            _updateCheckMessage.value = "Imyitozo yabitswe neza muri telefone! Inshuro $reps zanditswe."
        }
    }

    fun deleteWorkoutLog(id: Int) {
        viewModelScope.launch {
            repository.deleteWorkout(id)
        }
    }

    fun selectExerciseForWorkout(exercise: Exercise) {
        repExerciseName.value = exercise.izina
        setTab(ScreenTab.TOOLS)
    }
}
