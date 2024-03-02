package com.example.presentation.landing.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.presentation.landing.ui.Landing

const val NAVIGATION_LANDING = "landing"

fun NavGraphBuilder.landing(
    navigateToSignUp: () -> Unit,
) {
    composable(NAVIGATION_LANDING) {
        Landing(navigateToSingUp = navigateToSignUp)
    }
}

fun NavController.navigateToSplash() {
    navigate(NAVIGATION_LANDING)
}