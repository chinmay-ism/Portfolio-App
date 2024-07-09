package com.example.portfolioapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProjectScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(projects.size) { index ->
            ProjectItem(project = projects[index])
        }
    }
}

@Composable
fun ProjectItem(project: Project) {
    Card(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)) {
                Image(
                    painter = painterResource(id = project.projectImage),
                    contentDescription = project.projectName,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth().align(Alignment.Center)
                )
            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)) {
                Column() {
                    Text(
                        text = project.projectName,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Text(
                        text = project.projectDesc,
                        fontSize = 16.sp,
                        fontStyle = FontStyle.Italic
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ProjectScreenPreview() {
    ProjectScreen()
}