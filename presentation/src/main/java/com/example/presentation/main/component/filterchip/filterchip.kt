package com.example.presentation.main.component.filterchip

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.design_system.foundation.MoidaColor
import com.example.design_system.foundation.MoidaTypography

@Composable
fun MoidaFilter() {
    val options = listOf(
        "전체",
        "인기"
    )
    var selectedOption by remember {
        mutableStateOf("")
    }
    val onSelectionChange = { text: String ->
        selectedOption = text
    }

    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        options.forEach {text ->
            Row(
                modifier = Modifier.padding(end = 8.dp)
            ) {
                Text(
                    text = text,
                    style = MoidaTypography.Label,
                    color = if (text == selectedOption) Color.White else MoidaColor.gray400,
                    modifier = Modifier
                        .height(32.dp)
                        .width(57.dp)
                        .border(
                            width = 1.dp,
                            color = MoidaColor.main,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .clip(RoundedCornerShape(20.dp))
                        .clickable { onSelectionChange(text) }
                        .background(
                            if (text == selectedOption) {
                                MoidaColor.main
                            } else {
                                Color.White
                            }
                        )
                        .padding(
                            vertical = 8.dp,
                            horizontal = 16.dp
                        )
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewMoidaFilter() {
    MoidaFilter()
}