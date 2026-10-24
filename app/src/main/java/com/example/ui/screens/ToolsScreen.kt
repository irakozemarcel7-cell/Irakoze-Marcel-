package com.example.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.MainViewModel
import com.example.ui.components.RepCounterCard
import com.example.ui.components.StopwatchCard
import com.example.ui.theme.BurundiGreenPrimary

@Composable
fun ToolsScreen(
    viewModel: MainViewModel,
    modifier: Modifier = Modifier
) {
    var selectedToolTab by remember { mutableIntStateOf(0) }
    var showSaveDialog by remember { mutableStateOf(false) }
    var notesText by remember { mutableStateOf("") }

    val stopwatchSeconds by viewModel.stopwatchSeconds.collectAsState()
    val isStopwatchRunning by viewModel.isStopwatchRunning.collectAsState()
    val laps by viewModel.stopwatchLaps.collectAsState()

    val repExerciseName by viewModel.repExerciseName.collectAsState()
    val currentReps by viewModel.currentReps.collectAsState()
    val currentSets by viewModel.currentSets.collectAsState()
    val targetReps by viewModel.targetReps.collectAsState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .testTag("tools_screen")
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "IBIKORESHO BYO KWITOZA",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Black,
            color = MaterialTheme.colorScheme.onSurface
        )

        Text(
            text = "Ikinyangingo n'Ibaruriro ry'inshuro zikora nta nterineti",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Spacer(modifier = Modifier.height(12.dp))

        TabRow(
            selectedTabIndex = selectedToolTab,
            modifier = Modifier.fillMaxWidth()
        ) {
            Tab(
                selected = selectedToolTab == 0,
                onClick = { selectedToolTab = 0 },
                text = { Text("Ikinyangingo (Timer)", fontWeight = FontWeight.Bold, fontSize = 12.sp) }
            )
            Tab(
                selected = selectedToolTab == 1,
                onClick = { selectedToolTab = 1 },
                text = { Text("Ibaruriro (Reps)", fontWeight = FontWeight.Bold, fontSize = 12.sp) }
            )
        }

        Spacer(modifier = Modifier.height(14.dp))

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            if (selectedToolTab == 0) {
                item {
                    StopwatchCard(
                        seconds = stopwatchSeconds,
                        isRunning = isStopwatchRunning,
                        laps = laps,
                        onToggle = { viewModel.toggleStopwatch() },
                        onReset = { viewModel.resetStopwatch() },
                        onLap = { viewModel.addStopwatchLap() }
                    )
                }
            } else {
                item {
                    RepCounterCard(
                        exerciseName = repExerciseName,
                        currentReps = currentReps,
                        currentSets = currentSets,
                        targetReps = targetReps,
                        onIncrement = { viewModel.incrementReps() },
                        onDecrement = { viewModel.decrementReps() },
                        onCompleteSet = { viewModel.completeSet() },
                        onReset = { viewModel.resetRepCounter() },
                        onSaveWorkout = { showSaveDialog = true }
                    )
                }
            }

            item {
                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }

    if (showSaveDialog) {
        AlertDialog(
            onDismissRequest = { showSaveDialog = false },
            title = {
                Text(
                    text = "Bika iyi myitozo muri telefone",
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Column {
                    Text(
                        text = "Umwitozo: $repExerciseName\nInshuro: $currentReps (Série $currentSets)\nIgihe: ${stopwatchSeconds / 60}m ${stopwatchSeconds % 60}s",
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    OutlinedTextField(
                        value = notesText,
                        onValueChange = { notesText = it },
                        label = { Text("Ubutumwa cyangwa inama (Notes)...") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp)
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        viewModel.saveWorkoutSession(notesText)
                        notesText = ""
                        showSaveDialog = false
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = BurundiGreenPrimary)
                ) {
                    Text("Bika muri Telefone", fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                OutlinedButton(onClick = { showSaveDialog = false }) {
                    Text("Kureka")
                }
            }
        )
    }
}
