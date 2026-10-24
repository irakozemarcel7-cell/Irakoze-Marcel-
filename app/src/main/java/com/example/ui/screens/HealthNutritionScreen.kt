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
import androidx.compose.material3.TabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.repository.HealthTipRepository
import com.example.data.repository.NutritionRepository
import com.example.ui.MainViewModel
import com.example.ui.components.FoodItemCard
import com.example.ui.components.HealthTipCard
import com.example.ui.components.MealPlanCard
import com.example.ui.theme.BurundiGreenPrimary

@Composable
fun HealthNutritionScreen(
    viewModel: MainViewModel,
    modifier: Modifier = Modifier
) {
    var selectedSubTab by remember { mutableIntStateOf(0) }
    val searchQuery by viewModel.tipSearchQuery.collectAsState()
    val selectedCategory by viewModel.tipSelectedCategory.collectAsState()

    val filteredTips = HealthTipRepository.filterTips(
        query = searchQuery,
        category = selectedCategory
    )

    val tipCategories = listOf("Vyose", "Amazi", "Imfungurwa Nziza", "Kuruhuka", "Ivyo Kwirinda", "Imyitozo n'Imbaraga", "Isuku n'Ubuzima")

    Column(
        modifier = modifier
            .fillMaxSize()
            .testTag("health_nutrition_screen")
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "AMAGARA N'INTUNGAMUBIRI",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Black,
            color = MaterialTheme.colorScheme.onSurface
        )

        Text(
            text = "Inama 100 n'ubufunguriro bwo mu Burundi bitunganyirijwe amagara meza",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Subtabs: Inama (100) | Ubufunguriro | Gahunda y'Indyo
        TabRow(
            selectedTabIndex = selectedSubTab,
            modifier = Modifier.fillMaxWidth()
        ) {
            Tab(
                selected = selectedSubTab == 0,
                onClick = { selectedSubTab = 0 },
                text = { Text("Inama (100)", fontWeight = FontWeight.Bold, fontSize = 12.sp) }
            )
            Tab(
                selected = selectedSubTab == 1,
                onClick = { selectedSubTab = 1 },
                text = { Text("Ubufunguriro", fontWeight = FontWeight.Bold, fontSize = 12.sp) }
            )
            Tab(
                selected = selectedSubTab == 2,
                onClick = { selectedSubTab = 2 },
                text = { Text("Gahunda y'Indyo", fontWeight = FontWeight.Bold, fontSize = 12.sp) }
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        when (selectedSubTab) {
            0 -> {
                // Inama 100 Tab
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { viewModel.tipSearchQuery.value = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("tip_search_field"),
                    placeholder = { Text("Rondera inama (amazi, indyo, itiro...)...") },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Search, contentDescription = "Rondera")
                    },
                    trailingIcon = {
                        if (searchQuery.isNotEmpty()) {
                            IconButton(onClick = { viewModel.tipSearchQuery.value = "" }) {
                                Icon(imageVector = Icons.Default.Clear, contentDescription = "Siba")
                            }
                        }
                    },
                    shape = RoundedCornerShape(16.dp),
                    singleLine = true
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Categories Row
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    tipCategories.forEach { cat ->
                        FilterChip(
                            selected = selectedCategory == cat,
                            onClick = { viewModel.tipSelectedCategory.value = cat },
                            label = { Text(cat, fontSize = 12.sp) },
                            colors = FilterChipDefaults.filterChipColors(
                                selectedContainerColor = BurundiGreenPrimary,
                                selectedLabelColor = Color.White
                            )
                        )
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "${filteredTips.size} inama z'ubuzima zibonetse",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))

                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(filteredTips, key = { it.id }) { tip ->
                        HealthTipCard(
                            tip = tip,
                            isFavorite = viewModel.isFavorite("TIP_${tip.id}"),
                            onFavoriteToggle = {
                                viewModel.toggleFavorite(
                                    id = "TIP_${tip.id}",
                                    type = "TIP",
                                    title = tip.inama,
                                    subtitle = tip.icivugo
                                )
                            },
                            onClick = { /* Card can expand or show */ }
                        )
                    }
                    item {
                        Spacer(modifier = Modifier.height(24.dp))
                    }
                }
            }
            1 -> {
                // Ubufunguriro bwo mu Burundi Tab
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    item {
                        Text(
                            text = "Indyo gakondo yo mu Burundi n'intungamubiri zayo (Indagara, isombe, ibiharage, avoka, mukeke n'ibindi):",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    items(NutritionRepository.burundianFoods, key = { it.izina }) { food ->
                        FoodItemCard(food = food)
                    }
                    item {
                        Spacer(modifier = Modifier.height(24.dp))
                    }
                }
            }
            2 -> {
                // Daily Balanced Meal Plans Tab
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    item {
                        Text(
                            text = "Gahunda y'indyo yuzuye ya buri munsi (Igitondo, Sasita, Umugoroba) yateguwe hakoreshejwe ibiribwa biboneka mu Burundi:",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    items(NutritionRepository.sampleMealPlans, key = { it.izina }) { plan ->
                        MealPlanCard(plan = plan)
                    }
                    item {
                        Spacer(modifier = Modifier.height(24.dp))
                    }
                }
            }
        }
    }
}
