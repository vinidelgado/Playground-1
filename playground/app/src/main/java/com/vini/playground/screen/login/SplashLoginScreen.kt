package com.vini.playground.screen.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.vini.playground.R
import com.vini.playground.ui.theme.*

@ExperimentalCoilApi
@Composable
fun SplashLoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Gray24),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = rememberImagePainter(R.drawable.ic_dcy),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth(0.4f)
        )
        Text(
            "CRYPTO WALLET",
            color = White,
            style = mobileCrypto.subtitle1,
            modifier = Modifier.padding(vertical = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenSample() {
    PlaygroundTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(ProgressBarBackground),
            contentAlignment = Alignment.Center
        ) {
            SplashLoginScreen()
        }
    }
}