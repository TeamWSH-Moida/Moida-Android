package com.example.presentation.splash.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.design_system.foundation.MoidaTheme
import com.example.presentation.R

@Composable
internal fun Splash(
    onMoveNext: () -> Unit,
) {
    SplashScreen(onMoveNext = onMoveNext)
}

@Composable
private fun SplashScreen(
    onMoveNext: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MoidaTheme.colors.primary),
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_app_name),
            contentDescription = "app_name",
        )
        /*LaunchedEffect(Unit) {
            delay(2000)
            onMoveNext()
        }*/
    }
}
