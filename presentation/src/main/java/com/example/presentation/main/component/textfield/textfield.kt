package com.example.presentation.main.component.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.design_system.foundation.MoidaColor
import com.example.design_system.foundation.MoidaTheme
import com.example.design_system.foundation.MoidaTypography
import com.example.design_system.icon.MoidaSearchIcon
import kotlinx.coroutines.delay

@Composable
fun SearchTextField(
    modifier: Modifier = Modifier,
    setText: String,
    debounceTime: Long = 300L, // 입력 값의 변경을 감지, 변경 후 대기 시간 지정, 일정 시간 후 값 변경
    placeHolder: String = "",
    readOnly: Boolean = false, // 읽기 전용 true / false *
    focusManager: FocusManager = LocalFocusManager.current, // 포서스 관리
    focusRequester: FocusRequester = FocusRequester(), // 포커스 요청
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default, // 키보드 옵션
    keyboardActions: KeyboardActions = KeyboardActions.Default, // 키보드 관련 동작
    singleLine: Boolean = true, // 라인을 single로 true / false
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE, // 최대 라인의 수 1 ~ MAX
    visualTransformation: VisualTransformation = VisualTransformation.None, // 입력된 TextField의 텍스트를 시각적 효과를 가지게 함
    onValueChange: (String) -> Unit = {}, // 값 변경시 호출
    onSearchTextChange: (String) -> Unit = {} // 특정 검색 동작에 대한 텍스트 변경을 처리하는 콜백 함수
) {
    val isFocused = remember {
        mutableStateOf(false)
    } // textField가 현재 포커스를 받았는지 여부

    DisposableEffect(Unit) {
        onDispose {
            focusManager.clearFocus()
        }
    } // 해당 컴포넌트가 소멸될 때 focus -> clear

    LaunchedEffect(setText) {
        delay(debounceTime)
        onSearchTextChange(setText) // setText 값이 변경이 된다면 delay 이후 onSearchTextChange 호출
    } // 불필요한 검색 요청 방지
    Column {
        OutlinedTextField(
            value = setText,
            onValueChange = {
                onValueChange(it)
            },
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,

            placeholder = {
                Text(
                    text = placeHolder,
                    fontWeight = FontWeight.Normal,
                    color = MoidaColor.gray400,
                    style = MoidaTypography.Label
                )
            },
            modifier = modifier
                .fillMaxWidth()
                .focusRequester(focusRequester)
                .clip(RoundedCornerShape(12.dp))
                .background(MoidaTheme.colors.background)
                .border(
                    width = 1.dp,
                    color = if (isFocused.value) MoidaColor.main else MoidaColor.gray300,
                    shape = RoundedCornerShape(12.dp)
                )
                .onFocusChanged {
                    isFocused.value = it.isFocused
                },                                        
            maxLines = maxLines,
            singleLine = singleLine,
            textStyle = MoidaTypography.Label,
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black, // 사용자가 입력 중일 때의 텍스트 색상
                unfocusedTextColor = Color.Black, // focus가 해제된 상태에서의 텍스트 색상
                focusedPlaceholderColor = MoidaColor.gray400, // focus가 있을 때의 placeHolder의 색상
                unfocusedPlaceholderColor = MoidaColor.gray400, // focus가 없을 때의 placeHolder의 색상
                unfocusedBorderColor = MoidaColor.gray300, // focus가 없을 때의 외각선 색상
                focusedBorderColor = Color.White, // focus가 있을 때의 외각선 색상
                cursorColor = Color.Black // 사용자가 입력 중일 떄의 커서 색상
            ),
            trailingIcon = {
                MoidaSearchIcon(modifier = Modifier.padding(horizontal = 16.dp))
            },
            readOnly = readOnly,
            visualTransformation = visualTransformation
        )
    }
}

@Preview
@Composable
fun PreviewSearchTextField() {
    SearchTextField(setText = "한재형")
}