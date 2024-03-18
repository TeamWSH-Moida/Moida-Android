package com.example.presentation.main.component.floatingactionbutton

import androidx.compose.foundation.layout.padding
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.design_system.foundation.MoidaColor
import com.example.presentation.R

@Composable
fun MoidaFloatingActionButton() {
        FloatingActionButton(
            onClick = { /*TODO*/ },
            backgroundColor = MoidaColor.main,
            modifier = Modifier
                .padding(
                    start = 313.dp,
                    top = 755.dp
                )
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_write),
                tint = Color.White,
                contentDescription = "moida floatingbutton write img"
            )
        }
    }


@Preview
@Composable
fun PreviewMoidaFloatingActionButton() {
    MoidaFloatingActionButton()
}