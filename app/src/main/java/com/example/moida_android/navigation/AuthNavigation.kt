package com.example.moida_android.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.example.presentation.landing.navigation.landing
import com.example.presentation.landing.navigation.navigateToSplash
import com.example.presentation.splash.navigation.NAVIGATION_SPLASH
import com.example.presentation.splash.navigation.splash

const val NAVIGATION_AUTH = "auth"

internal fun NavGraphBuilder.authNavigation(navController: NavController) {
    navigation(
        route = NAVIGATION_AUTH,
        startDestination = NAVIGATION_SPLASH,
    ) {
        splash(onMoveNext = navController::navigateToSplash)
        landing(navigateToSignUp = {})
    }
}
