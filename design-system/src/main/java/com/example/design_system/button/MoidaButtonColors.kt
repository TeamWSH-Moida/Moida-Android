package com.example.design_system.button

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import com.example.design_system.foundation.MoidaColor

object MoidaButtonColors {

    @Stable
    val PrimaryColor = ButtonColor(
        defaultColor = DefaultColor.PrimaryDefaultColor,
        pressedColor = PressedColor.PrimaryPressedColor,
        disabledColor = DisabledColor.PrimaryDisabledColor,
    )

    @Stable
    val SecondaryColor = ButtonColor(
        defaultColor = DefaultColor.SecondaryDefaultColor,
        pressedColor = PressedColor.SecondaryPressedColor,
        disabledColor = DisabledColor.SecondaryDisabledColor,
    )
}

data class ButtonColorSet(
    val background: Color,
    val outLine: Color,
    val text: Color,
)

data class ButtonColor(
    val defaultColor: ButtonColorSet,
    val pressedColor: ButtonColorSet,
    val disabledColor: ButtonColorSet,
)

object DefaultColor {

    @Stable
    val PrimaryDefaultColor = ButtonColorSet(
        background = MoidaColor.main,
        outLine = MoidaColor.main,
        text = MoidaColor.white,
    )

    @Stable
    val SecondaryDefaultColor = ButtonColorSet(
        background = MoidaColor.white,
        outLine = MoidaColor.main,
        text = MoidaColor.main,
    )
}

object PressedColor {

    @Stable
    val PrimaryPressedColor = ButtonColorSet(
        background = MoidaColor.main600,
        outLine = MoidaColor.main600,
        text = MoidaColor.gray300,
    )

    @Stable
    val SecondaryPressedColor = ButtonColorSet(
        background = MoidaColor.gray300,
        outLine = MoidaColor.main600,
        text = MoidaColor.main600,
    )
}

object DisabledColor {

    @Stable
    val PrimaryDisabledColor = ButtonColorSet(
        background = MoidaColor.gray300,
        outLine = MoidaColor.gray300,
        text = MoidaColor.gray400,
    )

    @Stable
    val SecondaryDisabledColor = ButtonColorSet(
        background = MoidaColor.white,
        outLine = MoidaColor.gray400,
        text = MoidaColor.gray700,
    )
}
