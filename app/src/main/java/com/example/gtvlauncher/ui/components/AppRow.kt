package com.example.gtvlauncher.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AppRow(items: List<String>) {
    Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
        items.forEach { item ->
            Text(text = item, style = MaterialTheme.typography.body1)
        }
    }
}