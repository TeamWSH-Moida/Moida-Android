package com.example.design_system.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import com.example.design_system.foundation.MoidaTheme

@Composable
fun MoidaText(
    modifier: Modifier = Modifier,
    color: Color = MoidaTheme.colors.onBackground,
    text: String,
    style: TextStyle,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign? = null,
    textDecoration: TextDecoration = TextDecoration.None,
) {
    Text(
        modifier = modifier,
        color = color,
        text = text,
        style = style,
        overflow = overflow,
        maxLines = maxLines,
        textAlign = textAlign,
        textDecoration = textDecoration,
    )
}
