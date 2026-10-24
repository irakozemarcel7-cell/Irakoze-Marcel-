package com.example.data.model

data class WorkoutDay(
    val umusi: String, // e.g. "Ku wa Mbere"
    val intego: String,
    val imyitozo: List<String>,
    val igihe: String
)

data class WorkoutProgram(
    val id: String,
    val izina: String,
    val urwego: String,
    val ubusobanuro: String,
    val igiheKuNdwi: String,
    val iminsi: List<WorkoutDay>
)
