package com.example.portfolioapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AboutScreen(modifier: Modifier = Modifier) {
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp

    Box(modifier = modifier.fillMaxWidth().height(screenHeight)) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Chinmay Agrawal",
                fontSize = 50.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Cursive,

            )
            Spacer(modifier = Modifier.height(25.dp))
            Text(
                text = "Android Developer",
                fontSize = 25.sp,
                fontFamily = FontFamily.SansSerif
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AboutScreen()
}