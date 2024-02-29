package com.example.presentation.splash.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.presentation.splash.ui.Splash

const val NAVIGATION_SPLASH = "splash"

fun NavGraphBuilder.splash(
    onMoveNext: () -> Unit,
) {
    composable(NAVIGATION_SPLASH) {
        Splash(onMoveNext = onMoveNext)
    }
}

fun NavController.navigateToSplash() {
    navigate(NAVIGATION_SPLASH)
}
