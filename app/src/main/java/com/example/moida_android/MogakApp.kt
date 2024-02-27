package com.example.mogak_android

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.mogak_android.navigation.NAVIGATION_AUTH
import com.example.mogak_android.navigation.authNavigation

@Composable
internal fun MogakApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NAVIGATION_AUTH,
    ) {
        authNavigation(navController = navController)
    }
}
