package com.example.design_system.foundation

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.design_system.R

private val PretendardFamily = FontFamily(
    listOf(
        Font(
            resId = R.font.pretendard_semi_bold,
            weight = FontWeight.SemiBold,
        ),
        Font(
            resId = R.font.pretendard_regular,
            weight = FontWeight.Normal,
        ),
    ),
)

private val platformTextStyle = PlatformTextStyle(
    includeFontPadding = false,
)

object MoidaTypography {
    val TitleLarge
        @Composable get() = TextStyle(
            fontFamily = PretendardFamily,
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold,
            lineHeight = 36.sp,
            platformStyle = platformTextStyle,
            color = MoidaTheme.colors.onBackground,
        )

    val TitleMedium
        @Composable get() = TextStyle(
            fontFamily = PretendardFamily,
            fontSize = 26.sp,
            fontWeight = FontWeight.SemiBold,
            lineHeight = 31.sp,
            platformStyle = platformTextStyle,
            color = MoidaTheme.colors.onBackground,
        )

    val TitleSmall
        @Composable get() = TextStyle(
            fontFamily = PretendardFamily,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            lineHeight = 26.sp,
            platformStyle = platformTextStyle,
            color = MoidaTheme.colors.onBackground,
        )

    val BodyLarge
        @Composable get() = TextStyle(
            fontFamily = PretendardFamily,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            lineHeight = 25.sp,
            platformStyle = platformTextStyle,
            color = MoidaTheme.colors.onBackground,
        )

    val BodyMedium
        @Composable get() = TextStyle(
            fontFamily = PretendardFamily,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            lineHeight = 22.4.sp,
            platformStyle = platformTextStyle,
            color = MoidaTheme.colors.onBackground,
        )

    val BodySmall
        @Composable get() = TextStyle(
            fontFamily = PretendardFamily,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 22.sp,
            platformStyle = platformTextStyle,
            color = MoidaTheme.colors.onBackground,
        )

    val Label
        @Composable get() = TextStyle(
            fontFamily = PretendardFamily,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 20.sp,
            platformStyle = platformTextStyle,
            color = MoidaTheme.colors.onBackground,
        )
}
