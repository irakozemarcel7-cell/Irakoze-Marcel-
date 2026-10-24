package com.example.data.model

data class FoodItem(
    val izina: String,
    val ubwoko: String, // "Vyiza cyane" (Recommandé) or "Ivyo kugabanya/kwirinda" (À éviter/limiter)
    val ubusobanuro: String,
    val intungamubiri: String,
    val inamaYaMarcel: String
)

data class DailyMealPlan(
    val izina: String,
    val urwego: String,
    val igitondo: String,
    val sasita: String,
    val umugoroba: String,
    val inama: String
)
