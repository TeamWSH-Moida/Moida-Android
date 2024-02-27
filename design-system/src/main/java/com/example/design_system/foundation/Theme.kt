package com.example.design_system.foundation

import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

private val lightColorScheme = lightColorScheme(
    primary = MoidaColor.main,
    onPrimary = MoidaColor.main100,
    primaryContainer = MoidaColor.main200,
    onPrimaryContainer = MoidaColor.main300,
    inversePrimary = MoidaColor.main400,
    secondary = MoidaColor.main500,
    onSecondary = MoidaColor.main600,
    secondaryContainer = MoidaColor.main700,
    onSecondaryContainer = MoidaColor.main800,
    tertiary = MoidaColor.main900,
    onTertiary = MoidaColor.gray1000,
    tertiaryContainer = MoidaColor.gray100,
    onTertiaryContainer = MoidaColor.gray200,
    surface = MoidaColor.gray300,
    onSurface = MoidaColor.gray400,
    surfaceVariant = MoidaColor.gray500,
    onSurfaceVariant = MoidaColor.gray600,
    surfaceTint = MoidaColor.gray700,
    inverseSurface = MoidaColor.gray800,
    inverseOnSurface = MoidaColor.gray900,
    error = MoidaColor.error,
    background = MoidaColor.white,
    onBackground = MoidaColor.black,
)

@Composable
fun MoidaDesignSystemTheme(
    content: @Composable () -> Unit
) {

    CompositionLocalProvider(LocalColors provides lightColorScheme) {
        content()
    }
}

object MoidaTheme {
    val colors
        @Composable get() = LocalColors.current
}

val LocalColors = staticCompositionLocalOf { lightColorScheme }
