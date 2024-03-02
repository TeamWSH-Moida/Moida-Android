package com.example.moida_android

import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.moida_android.navigation.NAVIGATION_AUTH
import com.example.moida_android.navigation.authNavigation

@Composable
internal fun MogakApp() {
    val navController = rememberNavController()

    NavHost(
        modifier = Modifier.statusBarsPadding(),
        navController = navController,
        startDestination = NAVIGATION_AUTH,
    ) {
        authNavigation(navController = navController)
    }
}
