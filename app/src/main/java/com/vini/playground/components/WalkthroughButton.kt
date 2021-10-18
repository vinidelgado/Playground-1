package com.vini.playground.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import com.vini.playground.ui.theme.PlaygroundTheme
import com.vini.playground.ui.theme.WalkthroughButtonBackground
import com.vini.playground.ui.theme.walkthroughTypography

@Composable
fun WalkthroughButton(modifier: Modifier = Modifier, text: String) {
    Button(modifier = modifier.background(WalkthroughButtonBackground), onClick = {}) {
        Text(
            text = text,
            color = Color.White,
            style = walkthroughTypography.button
        )
    }

}

@Preview(showBackground = true)
@Composable
fun WalkthroughButtonPreview() {
    PlaygroundTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            WalkthroughButton(text = "Continuar")
        }
    }
}