package com.example.presentation.landing.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.design_system.foundation.MoidaColor
import com.example.design_system.foundation.MoidaTheme
import com.example.design_system.foundation.MoidaTypography
import com.example.design_system.text.MoidaText
import com.example.presentation.R

@Composable
internal fun Landing(
    navigateToSingUp: () -> Unit,
) {
    LandingScreen(onNextClick = navigateToSingUp)
}

@Composable
private fun LandingScreen(
    onNextClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MoidaTheme.colors.background)
            .padding(horizontal = 24.dp),
    ) {
        Spacer(modifier = Modifier.height(46.dp))
        MoidaText(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp),
            text = stringResource(id = R.string.landing_hello_msg),
            style = MoidaTypography.TitleMedium,
        )
        MoidaText(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp),
            text = stringResource(id = R.string.landing_hello_content),
            style = MoidaTypography.BodySmall,
            color = MoidaTheme.colors.surfaceTint,
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 36.dp),
            contentPadding = PaddingValues(vertical = 16.dp),
            border = BorderStroke(
                width = 1.dp,
                color = MoidaColor.black,
            ),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MoidaColor.white,
                contentColor = MoidaColor.black,
            ),
            onClick = onNextClick,
        ) {
            Image(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = R.drawable.ic_git),
                contentDescription = "git",
            )
            Spacer(modifier = Modifier.padding(start = 10.dp))
            MoidaText(
                text = stringResource(id = R.string.start_git),
                style = MoidaTypography.BodyMedium,
            )
        }
    }
}
