package com.example.data.model

data class Exercise(
    val id: Int,
    val izina: String,
    val urwego: String, // "Abatangura", "Abageze hagati", "Abamenyereye"
    val umugwi: String, // "Igikiriza", "Amaguru", "Inda", "Umugongo", "Amaboko", "Umubiri wose", "Cardio"
    val inshuro: String,
    val ubusobanuro: String,
    val intambwe: List<String>,
    val umutekano: String,
    val inamaYaMarcel: String,
    val ubwoko: String // "Kongereza Inguvu", "Kwinyugura", "Kurambura Imitsi", "Kugabanya Ibinure"
)
