package com.vini.playground.screen

import androidx.annotation.DrawableRes
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vini.playground.R
import com.vini.playground.components.LinearRoundedProgressIndicator
import com.vini.playground.ui.theme.*
import kotlin.random.Random

@Composable
fun WellnessScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(ProgressBarBackground, RectangleShape),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                text = "My Health Goals",
                style = progressBarTypography.h5,
                color = ProgressBarTopicPercentage
            )
            Spacer(modifier = Modifier.height(4.dp))
            LazyRow {
                items(5) { index ->
                    WellnessCard(
                        modifier = Modifier.size(230.dp),
                        wellnessName = "Steps $index",
                        wellnessTime = Random(index).nextInt(10, 60).toString(),
                        wellnessPercentage = Random.nextFloat()
                    )
                }
            }

        }
    }
}

@Composable
fun WellnessCard(
    modifier: Modifier = Modifier,
    wellnessName: String,
    wellnessTime: String,
    wellnessPercentage: Float
) {
    Box(
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 24.dp)
            .background(Color.White, MaterialTheme.shapes.medium)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 12.dp), verticalArrangement = Arrangement.Center
        ) {
            WellnessName(wellnessName)
            Text(
                "$wellnessTime MIN",
                modifier = Modifier.padding(start = 13.dp),
                style = progressBarTypography.caption,
                color = ProgressBarTopicTime
            )
            WellnessImage(R.drawable.ic_progressbar_lotus)
            Text(
                String.format("%.2f", wellnessPercentage * 100) + "%",
                style = progressBarTypography.h5,
                color = ProgressBarTopicPercentage
            )
            Spacer(modifier = Modifier.height(8.dp))
            WellnessProgress(progressValue = wellnessPercentage, color = ProgressBarPercentage)
        }
    }
}

@Composable
fun WellnessProgress(
    progressValue: Float,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colors.primary
) {
    val progress = remember {
        Animatable(0f)
    }

    LinearRoundedProgressIndicator(
        progress = progress.value,
        color = color,
        modifier = modifier,
        backgroundColor = ProgressBarTopicTime
    )

    LaunchedEffect(Unit) {
        progress.animateTo(
            progressValue,
            animationSpec = tween(
                durationMillis = 450,
                easing = LinearOutSlowInEasing,
                delayMillis = 100
            )
        )
    }
}


@Composable
fun WellnessImage(@DrawableRes icTopicImage: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.End
    ) {
        Image(
            modifier = Modifier.height(56.dp),
            painter = painterResource(id = icTopicImage),
            contentDescription = "",
            colorFilter = ColorFilter.tint(
                Color.Black.copy(alpha = 0.12f)
            ),
            contentScale = ContentScale.FillHeight
        )
    }
}

@Composable
fun WellnessName(name: String, color: Color = ProgressBarPercentage) {
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
fun WellnessScreenSample() {
    PlaygroundTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(ProgressBarBackground),
            contentAlignment = Alignment.Center
        ) {
            WellnessScreen()
        }
    }
}