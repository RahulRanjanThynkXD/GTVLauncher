plugins { 
    id("com.android.application") 
    kotlin("android")
}

android { 
    compileSdk = 33

    defaultConfig { 
        applicationId = "com.example.tvlauncher"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes { 
        release { 
            isMinifyEnabled = false 
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies { 
    implementation("androidx.compose.ui:ui:1.0.5")
    implementation("androidx.compose.material:material:1.0.5")
    implementation("androidx.compose.ui:ui-tooling:1.0.5")
    implementation("androidx.activity:activity-compose:1.4.0")
    implementation("androidx.tv.provider:tv-provider:1.0.0")
    implementation("androidx.tv:tv-compose:1.0.0")
}