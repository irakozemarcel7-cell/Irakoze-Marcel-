package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ui.MainViewModel
import com.example.ui.ScreenTab
import com.example.ui.components.NetworkStatusBadge
import com.example.ui.screens.ExercisesScreen
import com.example.ui.screens.HealthNutritionScreen
import com.example.ui.screens.HistoryFavoritesScreen
import com.example.ui.screens.HomeScreen
import com.example.ui.screens.OfflinePwaInfoScreen
import com.example.ui.screens.ProgramsScreen
import com.example.ui.screens.ToolsScreen
import com.example.ui.theme.BurundiAmber
import com.example.ui.theme.BurundiGreenPrimary
import com.example.ui.theme.BurundiRedPrimary
import com.example.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                MainApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainApp(viewModel: MainViewModel = viewModel()) {
    val currentTab by viewModel.currentTab.collectAsState()
    val isOnline by viewModel.isOnline.collectAsState()
    val updateMessage by viewModel.updateCheckMessage.collectAsState()

    // Handle back button to return to Home screen
    BackHandler(enabled = currentTab != ScreenTab.HOME) {
        viewModel.setTab(ScreenTab.HOME)
    }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .testTag("main_scaffold"),
        contentWindowInsets = WindowInsets.safeDrawing,
        topBar = {
            Column {
                TopAppBar(
                    title = {
                        Column {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(
                                    modifier = Modifier
                                        .size(10.dp)
                                        .clip(CircleShape)
                                        .background(BurundiRedPrimary)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "MOTIVATEUR MARCEL+257",
                                    fontWeight = FontWeight.Black,
                                    fontSize = 18.sp,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            }
                            Text(
                                text = "AMAGARA IMBERE YA VYOSE",
                                fontWeight = FontWeight.Bold,
                                fontSize = 10.sp,
                                color = BurundiGreenPrimary,
                                letterSpacing = 1.sp
                            )
                        }
                    },
                    actions = {
                        IconButton(
                            onClick = { viewModel.setTab(ScreenTab.HISTORY_FAVORITES) },
                            modifier = Modifier.testTag("top_history_favorites_button")
                        ) {
                            Icon(
                                imageVector = Icons.Default.Bookmark,
                                contentDescription = "Ibikundwa n'Amateka",
                                tint = if (currentTab == ScreenTab.HISTORY_FAVORITES) BurundiAmber else MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }

                        IconButton(
                            onClick = { viewModel.setTab(ScreenTab.PWA_INFO) },
                            modifier = Modifier.testTag("top_pwa_info_button")
                        ) {
                            Icon(
                                imageVector = Icons.Default.Info,
                                contentDescription = "Amakuru ya Hors Ligne",
                                tint = if (currentTab == ScreenTab.PWA_INFO) BurundiGreenPrimary else MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.surface
                    )
                )

                // Real-time network monitor badge
                NetworkStatusBadge(
                    isOnline = isOnline,
                    onCheckUpdate = { viewModel.checkForUpdates() }
                )
            }
        },
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surface,
                tonalElevation = 8.dp
            ) {
                NavigationBarItem(
                    selected = currentTab == ScreenTab.HOME,
                    onClick = { viewModel.setTab(ScreenTab.HOME) },
                    icon = { Icon(Icons.Default.Home, contentDescription = "Ahabanza") },
                    label = { Text("Ahabanza", fontSize = 11.sp, fontWeight = FontWeight.Medium) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = BurundiGreenPrimary,
                        selectedTextColor = BurundiGreenPrimary,
                        indicatorColor = BurundiGreenPrimary.copy(alpha = 0.15f)
                    ),
                    modifier = Modifier.testTag("nav_home")
                )

                NavigationBarItem(
                    selected = currentTab == ScreenTab.EXERCISES,
                    onClick = { viewModel.setTab(ScreenTab.EXERCISES) },
                    icon = { Icon(Icons.Default.FitnessCenter, contentDescription = "Imyitozo") },
                    label = { Text("Imyitozo (52)", fontSize = 11.sp, fontWeight = FontWeight.Medium) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = BurundiGreenPrimary,
                        selectedTextColor = BurundiGreenPrimary,
                        indicatorColor = BurundiGreenPrimary.copy(alpha = 0.15f)
                    ),
                    modifier = Modifier.testTag("nav_exercises")
                )

                NavigationBarItem(
                    selected = currentTab == ScreenTab.NUTRITION,
                    onClick = { viewModel.setTab(ScreenTab.NUTRITION) },
                    icon = { Icon(Icons.Default.Restaurant, contentDescription = "Amagara") },
                    label = { Text("Amagara (100)", fontSize = 11.sp, fontWeight = FontWeight.Medium) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = BurundiGreenPrimary,
                        selectedTextColor = BurundiGreenPrimary,
                        indicatorColor = BurundiGreenPrimary.copy(alpha = 0.15f)
                    ),
                    modifier = Modifier.testTag("nav_nutrition")
                )

                NavigationBarItem(
                    selected = currentTab == ScreenTab.PROGRAMS,
                    onClick = { viewModel.setTab(ScreenTab.PROGRAMS) },
                    icon = { Icon(Icons.Default.Schedule, contentDescription = "Intunganyo") },
                    label = { Text("Intunganyo", fontSize = 11.sp, fontWeight = FontWeight.Medium) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = BurundiGreenPrimary,
                        selectedTextColor = BurundiGreenPrimary,
                        indicatorColor = BurundiGreenPrimary.copy(alpha = 0.15f)
                    ),
                    modifier = Modifier.testTag("nav_programs")
                )

                NavigationBarItem(
                    selected = currentTab == ScreenTab.TOOLS,
                    onClick = { viewModel.setTab(ScreenTab.TOOLS) },
                    icon = { Icon(Icons.Default.Timer, contentDescription = "Ibikoresho") },
                    label = { Text("Ibikoresho", fontSize = 11.sp, fontWeight = FontWeight.Medium) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = BurundiGreenPrimary,
                        selectedTextColor = BurundiGreenPrimary,
                        indicatorColor = BurundiGreenPrimary.copy(alpha = 0.15f)
                    ),
                    modifier = Modifier.testTag("nav_tools")
                )
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (currentTab) {
                ScreenTab.HOME -> HomeScreen(viewModel = viewModel)
                ScreenTab.EXERCISES -> ExercisesScreen(viewModel = viewModel)
                ScreenTab.NUTRITION -> HealthNutritionScreen(viewModel = viewModel)
                ScreenTab.PROGRAMS -> ProgramsScreen(viewModel = viewModel)
                ScreenTab.TOOLS -> ToolsScreen(viewModel = viewModel)
                ScreenTab.HISTORY_FAVORITES -> HistoryFavoritesScreen(viewModel = viewModel)
                ScreenTab.PWA_INFO -> OfflinePwaInfoScreen(viewModel = viewModel)
            }
        }
    }

    // Modal dialogue for updates or save confirmation
    updateMessage?.let { msg ->
        AlertDialog(
            onDismissRequest = { viewModel.dismissUpdateMessage() },
            title = {
                Text(
                    text = "MOTIVATEUR MARCEL+257",
                    fontWeight = FontWeight.Black
                )
            },
            text = {
                Text(
                    text = msg,
                    style = MaterialTheme.typography.bodyMedium
                )
            },
            confirmButton = {
                Button(
                    onClick = { viewModel.dismissUpdateMessage() },
                    colors = ButtonDefaults.buttonColors(containerColor = BurundiGreenPrimary)
                ) {
                    Text("Sawa (Ego)", fontWeight = FontWeight.Bold)
                }
            }
        )
    }
}
