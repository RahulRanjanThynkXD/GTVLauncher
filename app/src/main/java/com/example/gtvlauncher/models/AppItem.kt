package com.example.gtvlauncher.models

data class AppItem(
    val name: String,
    val packageName: String,
    val iconUrl: String?,
    val isInstalled: Boolean
)