package com.example.gtvlauncher.ui.components

import androidx.compose.material.TopAppBar
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TopBar(title: String) {
    TopAppBar(
        title = { Text(text = title) }
    )
}

@Preview
@Composable
fun TopBarPreview() {
    TopBar(title = "Top Navigation Bar")
}