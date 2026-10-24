package com.example.ui.screens

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.repository.ExerciseRepository
import com.example.ui.MainViewModel
import com.example.ui.components.ExerciseCard
import com.example.ui.components.ExerciseDetailSheet
import com.example.ui.theme.BurundiGreenPrimary

@Composable
fun ExercisesScreen(
    viewModel: MainViewModel,
    modifier: Modifier = Modifier
) {
    val searchQuery by viewModel.exerciseSearchQuery.collectAsState()
    val selectedLevel by viewModel.exerciseSelectedLevel.collectAsState()
    val selectedMuscle by viewModel.exerciseSelectedMuscle.collectAsState()
    val selectedExerciseForDetail by viewModel.selectedExerciseForDetail.collectAsState()

    val filteredExercises = ExerciseRepository.filterExercises(
        query = searchQuery,
        urwego = selectedLevel,
        umugwi = selectedMuscle
    )

    val levels = listOf("Vyose", "Abatangura", "Abageze hagati", "Abamenyereye")
    val muscles = listOf("Vyose", "Igikiriza", "Amaguru", "Inda", "Umugongo", "Amaboko", "Cardio")

    Column(
        modifier = modifier
            .fillMaxSize()
            .testTag("exercises_screen")
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "IMYITOZO NGORORAMUBIRI (52)",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Black,
            color = MaterialTheme.colorScheme.onSurface
        )

        Text(
            text = "Imyitozo isobanuwe mu Kirundi ikora utarinze interineti",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Search Bar
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { viewModel.exerciseSearchQuery.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .testTag("exercise_search_field"),
            placeholder = { Text("Rondera umwitozo, imitsi cyangwa urwego...") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Rondera")
            },
            trailingIcon = {
                if (searchQuery.isNotEmpty()) {
                    IconButton(onClick = { viewModel.exerciseSearchQuery.value = "" }) {
                        Icon(imageVector = Icons.Default.Clear, contentDescription = "Siba")
                    }
                }
            },
            shape = RoundedCornerShape(16.dp),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Level Filter Chips
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            levels.forEach { level ->
                FilterChip(
                    selected = selectedLevel == level,
                    onClick = { viewModel.exerciseSelectedLevel.value = level },
                    label = { Text(level, fontSize = 12.sp) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = BurundiGreenPrimary,
                        selectedLabelColor = androidx.compose.ui.graphics.Color.White
                    )
                )
            }
        }

        // Muscle Group Filter Chips
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            muscles.forEach { muscle ->
                FilterChip(
                    selected = selectedMuscle == muscle,
                    onClick = { viewModel.exerciseSelectedMuscle.value = muscle },
                    label = { Text(muscle, fontSize = 12.sp) }
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "${filteredExercises.size} imyitozo ibonetse",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Exercises List
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(filteredExercises, key = { it.id }) { ex ->
                ExerciseCard(
                    exercise = ex,
                    isFavorite = viewModel.isFavorite("EX_${ex.id}"),
                    onFavoriteToggle = {
                        viewModel.toggleFavorite(
                            id = "EX_${ex.id}",
                            type = "EXERCISE",
                            title = ex.izina,
                            subtitle = "${ex.umugwi} • ${ex.urwego}"
                        )
                    },
                    onClick = { viewModel.selectedExerciseForDetail.value = ex },
                    onStartWorkout = { viewModel.selectExerciseForWorkout(ex) }
                )
            }
            item {
                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }

    // Detail Bottom Sheet if exercise selected
    selectedExerciseForDetail?.let { ex ->
        ExerciseDetailSheet(
            exercise = ex,
            isFavorite = viewModel.isFavorite("EX_${ex.id}"),
            onFavoriteToggle = {
                viewModel.toggleFavorite(
                    id = "EX_${ex.id}",
                    type = "EXERCISE",
                    title = ex.izina,
                    subtitle = "${ex.umugwi} • ${ex.urwego}"
                )
            },
            onStartWorkout = {
                viewModel.selectedExerciseForDetail.value = null
                viewModel.selectExerciseForWorkout(ex)
            },
            onDismiss = { viewModel.selectedExerciseForDetail.value = null }
        )
    }
}
