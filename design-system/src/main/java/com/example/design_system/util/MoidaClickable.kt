package com.example.design_system.util

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Modifier.moidaClickable(
    rippleEnabled: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = MutableInteractionSource(),
    onClick: () -> Unit,
): Modifier {
    return this
        .clickable(
            onClick = onClick,
            enabled = enabled,
            interactionSource = interactionSource,
            indication = rememberRipple(
                color = Color.Unspecified,
            ).takeIf {
                rippleEnabled
            },
        )
}
