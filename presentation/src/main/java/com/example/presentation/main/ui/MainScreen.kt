package com.example.presentation.main.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalMinimumInteractiveComponentEnforcement
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.design_system.foundation.MoidaColor
import com.example.design_system.foundation.MoidaTypography
import com.example.design_system.text.MoidaText
import com.example.presentation.R
import com.example.presentation.main.component.filterchip.MoidaFilter
import com.example.presentation.main.component.floatingactionbutton.MoidaFloatingActionButton
import com.example.presentation.main.component.list.Project
import com.example.presentation.main.component.list.ProjectItem
import com.example.presentation.main.component.list.ProjectRepository
import com.example.presentation.main.component.textfield.SearchTextField

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun MainScreen(
    projectSearch: String
) {
    val projectRepository = ProjectRepository()
    val getAllData = projectRepository.getAllData()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MoidaColor.gray100)
            .padding(horizontal = 24.dp)
            .padding(bottom = 16.dp),
        verticalArrangement = Arrangement.Top
    )
    {
            CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false) {
                Row(
                    modifier = Modifier
                        .padding(vertical = 16.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        modifier = Modifier
                            .height(24.dp)
                            .width(24.dp),
                        onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_menubar),
                            contentDescription = "moida menubar"
                        )
                    }
                    MoidaText(
                        modifier = Modifier,
                        text = stringResource(id = R.string.main_moidatext),
                        style = MoidaTypography.BodyMedium
                    )
                    IconButton(
                        modifier = Modifier
                            .height(24.dp)
                            .width(24.dp),
                        onClick = { /*TODO*/ },
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_moida_sample_profile),
                            tint = Color.White,
                            contentDescription = "moida sample profile"
                        )
                    }
                }
            }
        Spacer(modifier = Modifier.height(18.dp))
        SearchTextField(
            setText = projectSearch,
            modifier = Modifier
                .padding(vertical = 8.dp)
                .fillMaxWidth(),
            placeHolder = "전공, 프로젝트 이름 등을 검색해보세요.",
            singleLine = true
        )
        Spacer(modifier = Modifier.height(8.dp))
        MoidaFilter()
        LazyColumn(
            modifier = Modifier
                .padding(top = 34.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            itemsIndexed(
                items = getAllData,
                key = { index: Int, item: Project ->
                    item.id
                }
            ) {index: Int, item: Project ->
                ProjectItem(project = item)
            }
        }
    }
    Column {
        MoidaFloatingActionButton()
    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    MainScreen(
        projectSearch = "",
    )
}