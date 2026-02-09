package com.example.gtvlauncher.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AdsRow(ads: List<String>) {
    LazyRow(Modifier.horizontalScroll(rememberScrollState())) {
        items(ads.size) { index ->
            Card(
                modifier = Modifier.padding(8.dp),
                elevation = 4.dp
            ) {
                Text(text = ads[index], style = MaterialTheme.typography.bodyLarge)
            }
        }
    }
}