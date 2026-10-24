package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.CloudDone
import androidx.compose.material.icons.filled.CloudOff
import androidx.compose.material.icons.filled.DownloadDone
import androidx.compose.material.icons.filled.InstallMobile
import androidx.compose.material.icons.filled.Memory
import androidx.compose.material.icons.filled.Security
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.WifiOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
import com.example.ui.MainViewModel
import com.example.ui.theme.BurundiAmber
import com.example.ui.theme.BurundiGreenPrimary
import com.example.ui.theme.BurundiRedPrimary

@Composable
fun OfflinePwaInfoScreen(
    viewModel: MainViewModel,
    modifier: Modifier = Modifier
) {
    val isOnline by viewModel.isOnline.collectAsState()

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .testTag("offline_pwa_info_screen")
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "GUSHIRA MURI TELEFONE & MODE HORS LIGNE",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Black,
                color = MaterialTheme.colorScheme.onSurface
            )

            Text(
                text = "Uko iyi porogarama ikora 100% idasaba interineti no mu buryo bwa PWA",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        // Current status highlight
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = if (isOnline) BurundiGreenPrimary.copy(alpha = 0.12f) else BurundiAmber.copy(alpha = 0.15f)
                )
            ) {
                Row(
                    modifier = Modifier.padding(18.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(CircleShape)
                            .background(if (isOnline) BurundiGreenPrimary else BurundiAmber),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = if (isOnline) Icons.Default.CloudDone else Icons.Default.WifiOff,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    Column {
                        Text(
                            text = if (isOnline) "URI KU MURONGO (EN LIGNE)" else "HORS LIGNE (UDASUNZWE KURI INTERNET)",
                            fontWeight = FontWeight.Black,
                            fontSize = 13.sp,
                            color = if (isOnline) BurundiGreenPrimary else BurundiAmber
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Porogarama yawe yuzuye 100%! Imyitozo yose 52 n'inama 100 zirabitswe muri telefone.",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            }
        }

        // Section 1: Offline Features Checklist
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
                )
            ) {
                Column(modifier = Modifier.padding(18.dp)) {
                    Text(
                        text = "1. Ibintu Bikora Utarinze Interineti (100% Hors Ligne):",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = BurundiGreenPrimary
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    FeatureCheckItem("Gufungura urupapuro rw'itangiriro (Ahabanza) nta nterineti.")
                    FeatureCheckItem("Gusoma imyitozo 52 yose n'intambwe zayo mu Kirundi.")
                    FeatureCheckItem("Gusoma inama 100 z'ubuzima, amazi n'imirire myiza.")
                    FeatureCheckItem("Kureba ibiryo byo gufungura n'ibyo kwirinda byo mu Burundi.")
                    FeatureCheckItem("Gukurikiza intunganyo z'imyitozo y'indwi (Abatangiye & Abamenyereye).")
                    FeatureCheckItem("Gukoresha ikinyangingo (Stopwatch) n'ibaruriro ry'inshuro (Reps counter).")
                    FeatureCheckItem("Kubika amateka n'iterambere ryawe (Progression) muri telefone.")
                    FeatureCheckItem("Kugumana amakuru yawe yose n'iyo ufunze telefone ukongera ukayifungura.")
                }
            }
        }

        // Section 2: PWA & Android Installation
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
                )
            ) {
                Column(modifier = Modifier.padding(18.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.InstallMobile,
                            contentDescription = null,
                            tint = BurundiGreenPrimary,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "2. Uko Uyishyira muri Telefone (PWA & Android):",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    InstallStepItem(
                        number = "A",
                        title = "Nka Porogarama ya Android (APK Natif):",
                        description = "Iyi porogarama yanditswe mu buryo bw'ibanze bwa Android (Kotlin & Jetpack Compose). Iyo wayishyizemo, igira ikirangamuryango cy'amagara (App Icon) cyihariye kandi igakora vuba cyane nta kibazo."
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    InstallStepItem(
                        number = "B",
                        title = "Nka Progressive Web App (PWA):",
                        description = "Dukoresheje 'manifest.json' na 'sw.js' (Service Worker), iyi porogarama irabikwa muri Cache Storage ya terefone yawe. Kuri Chrome, kanda ku manota atatu hejuru y'iburyo hanyuma uhitemo 'Shyira ku kiratasi cy'ibanze' (Installer l'application)."
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    InstallStepItem(
                        number = "C",
                        title = "Ubwirinde bwa Telefone zifise 2 Go za RAM:",
                        description = "Porogarama yateguwe ku buryo itaremerera umutwe n'ububiko bwa telefone (RAM). Nta mafoto manini aribwa mu bubiko bwa telefone!"
                    )
                }
            }
        }

        // Section 3: Check for updates action
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
                )
            ) {
                Column(modifier = Modifier.padding(18.dp)) {
                    Text(
                        text = "3. Gusuzuma Muri Verisiyo Nshya (Mise à jour):",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Iyo ubonye interineti, kanda kuri buto yo hasi kugira usuzume ko nta bishasha byongewemo. Ntacyo bihungabanya ku myitozo n'ibikundwa wamaze kwandika!",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(14.dp))
                    Button(
                        onClick = { viewModel.checkForUpdates() },
                        colors = ButtonDefaults.buttonColors(containerColor = BurundiGreenPrimary),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(imageVector = Icons.Default.CloudDone, contentDescription = null)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Suzuma Muri Verisiyo Nshya Ubu", fontWeight = FontWeight.Bold)
                    }
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
private fun FeatureCheckItem(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.Top
    ) {
        Icon(
            imageVector = Icons.Default.CheckCircle,
            contentDescription = null,
            tint = BurundiGreenPrimary,
            modifier = Modifier.size(16.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}

@Composable
private fun InstallStepItem(number: String, title: String, description: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.Top
    ) {
        Box(
            modifier = Modifier
                .size(24.dp)
                .clip(CircleShape)
                .background(BurundiGreenPrimary),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = number,
                color = Color.White,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = description,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}
