package com.example.presentation.main.component.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.design_system.foundation.MoidaColor
import com.example.design_system.foundation.MoidaTypography
import com.example.presentation.R

data class Project( // 일단 임으로 데이터 넣음
    val id: String,
    val write: String,
    val idea: String,
    val date: String,
    val starcount: Int
)

class ProjectRepository { // 일단 임의로 데이터 넣음
    fun getAllData(): List<Project> {
        return listOf(
            Project(
                id = "이명훈",
                write = "아무나아무나아무나아두이노",
                idea = "일단 신청해봐.",
                date = "2024.03.14",
                starcount = 57
            ),
            Project(
                id = "한재형",
                write = "제발 아무나 들어와요ㅜㅜㅜ",
                idea = "일단 들어와봐.",
                date = "2024.03.14",
                starcount = 1
            ),
            Project(
                id = "강민규",
                write = "에휴 ai 혼자 못해 먹겠네..!",
                idea = "일단 오라고.",
                date = "2024.03.14",
                starcount = 7
            ),
            Project(
                id = "서목룡",
                write = "심심해요ㅠㅠㅠㅠ 놀아줄 사람",
                idea = "여자만 와봐.",
                date = "2024.03.14",
                starcount = 3
            ),
            Project(
                id = "땃쥐",
                write = "찍찍찍찍찍찍찍찍찍찍찍찍",
                idea = "일단 찢.",
                date = "2024.03.14",
                starcount = 99
            ),
            Project(
                id = "박종환",
                write = "들어와주세요;;ㅜㅜ",
                idea = "들어오면 알려드림ㅋㅋ",
                date = "2024.03.17",
                starcount = 19
            )
        )
    }
}

@Composable
fun ProjectItem(
    project: Project,
    ){
    val (isClicked, setIsClicked) = remember { mutableStateOf(false) }
    var count = remember { mutableStateOf(0) }

    Column() {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .width(312.dp)
                .height(143.dp)
                .clip(RoundedCornerShape(12.dp))
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(143.dp)
                    .background(Color.White)
            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(
                            vertical = 20.dp, horizontal = 24.dp
                        ),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = project.id,
                            style = MoidaTypography.BodySmall
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        IconButton(
                            onClick = {
                                setIsClicked(!isClicked)
                                      },
                            modifier = Modifier
                                .width(17.11.dp)
                                .height(16.36.dp)
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.ic_round_star),
                                tint = if (isClicked) Color.Yellow else MoidaColor.gray400,
                                contentDescription = "moida star button"
                            )
                        }
                        Text(
                            text = project.starcount.toString(),
                            style = MoidaTypography.BodySmall,
                            color = MoidaColor.gray400
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = project.write,
                        style = MoidaTypography.BodyMedium
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "아이디어 | ${project.idea}",
                        style = MoidaTypography.BodySmall,
                        color = MoidaColor.gray700
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "지원 마감 | ${project.date}",
                        style = MoidaTypography.BodySmall,
                        color = MoidaColor.gray700
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewProjectList() {
    ProjectItem(project = Project(
            id = "이명훈",
            idea = "일단 들어와봐..!",
            write = "이명훈 입니다!",
            date = "2024.03.14",
            starcount = 12
        ),

        )
}