package com.example.design_system.button

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.design_system.util.moidaClickable

@Composable
fun MoidaButton(
    modifier: Modifier = Modifier,
    text: String,
    color: ButtonColor = MoidaButtonColors.PrimaryColor,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(12.dp),
    rippleEnabled: Boolean = false,
    style: TextStyle,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val pressed by interactionSource.collectIsPressedAsState()

    val backgroundColor by animateColorAsState(
        targetValue = if (!enabled) {
            color.disabledColor.background
        } else if (pressed) {
            color.pressedColor.background
        } else {
            color.defaultColor.background
        },
        label = "",
    )

    val outLineColor by animateColorAsState(
        targetValue = if (!enabled) {
            color.disabledColor.outLine
        } else if (pressed) {
            color.pressedColor.outLine
        } else {
            color.defaultColor.outLine
        },
        label = "",
    )

    val textColor by animateColorAsState(
        targetValue = if (!enabled) {
            color.disabledColor.text
        } else if (pressed) {
            color.pressedColor.text
        } else {
            color.defaultColor.text
        },
        label = "",
    )

    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = shape)
            .border(
                width = 1.dp,
                color = outLineColor,
                shape = shape,
            )
            .moidaClickable(
                rippleEnabled = rippleEnabled,
                enabled = enabled,
                onClick = onClick,
                interactionSource = interactionSource,
            )
            .background(
                color = backgroundColor,
                shape = shape,
            ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = text,
            style = style,
            color = textColor,
        )
    }
}
