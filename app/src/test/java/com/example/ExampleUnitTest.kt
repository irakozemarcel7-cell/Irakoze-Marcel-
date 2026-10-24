package com.example

import com.example.data.repository.ExerciseRepository
import com.example.data.repository.HealthTipRepository
import com.example.data.repository.NutritionRepository
import com.example.data.repository.ProgramRepository
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun exercisesCount_isAtLeast50() {
        val total = ExerciseRepository.allExercises.size
        assertTrue("Exercises must be at least 50 in Kirundi, found $total", total >= 50)
    }

    @Test
    fun healthTipsCount_isAtLeast100() {
        val total = HealthTipRepository.allTips.size
        assertTrue("Health tips must be at least 100 in Kirundi, found $total", total >= 100)
    }

    @Test
    fun nutritionAndBurundianFoods_arePresent() {
        assertTrue("Burundian foods must not be empty", NutritionRepository.burundianFoods.isNotEmpty())
        assertTrue("Meal plans must not be empty", NutritionRepository.sampleMealPlans.isNotEmpty())

        val indagara = NutritionRepository.burundianFoods.find { it.izina.contains("Indagara", ignoreCase = true) }
        assertNotNull("Indagara must be included", indagara)

        val isombe = NutritionRepository.burundianFoods.find { it.izina.contains("isombe", ignoreCase = true) }
        assertNotNull("Isombe must be included", isombe)
    }

    @Test
    fun weeklyPrograms_areAvailable() {
        assertTrue("Programs must be defined", ProgramRepository.weeklyPrograms.isNotEmpty())
        val beginnerProg = ProgramRepository.weeklyPrograms.find { it.urwego == "Abatangura" }
        assertNotNull("Beginner program must exist", beginnerProg)
    }
}
