package com.vini.playground.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vini.playground.R
import com.vini.playground.ui.theme.*

@Composable
fun ProgressbarScreen() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .padding(horizontal = 16.dp, vertical = 24.dp)
            .background(Color.White, MaterialTheme.shapes.medium)
    ) {
        Column() {
            Topic("MINDFULLNESS")
            Text(
                "10 MIN",
                modifier = Modifier.padding(start = 13.dp),
                style = progressBarTypography.caption,
                color = ProgressBarTopicTime
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Image(
                    modifier = Modifier.height(40.dp),
                    painter = painterResource(id = R.drawable.ic_progressbar_lotus),
                    contentDescription = "",
                    colorFilter = ColorFilter.tint(
                        Color.Black.copy(alpha = 0.12f)
                    ),
                    contentScale = ContentScale.FillHeight
                )
            }
        }
//        Text("75%")
//        TODO: Progress aqui
    }
}

@Composable
fun Topic(name: String, color: Color = ProgressBarPercentage) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(5.dp)
                .background(color, CircleShape)
        )
        Spacer(modifier = Modifier.width(7.dp))
        Text(name, style = progressBarTypography.caption)
    }
}

@Preview(showBackground = true)
@Composable
fun ProgressBarScreenSample() {
    PlaygroundTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(ProgressBarBackground),
            contentAlignment = Alignment.Center
        ) {
            ProgressbarScreen()
        }
    }
}