package com.vini.playground.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vini.playground.ui.theme.ParallaxRed
import com.vini.playground.ui.theme.PlaygroundTheme
import com.vini.playground.ui.theme.parallaxTypography

@Composable
fun Tag(
    modifier: Modifier = Modifier,
    backgroundColor: Color = ParallaxRed,
    textColor: Color = Color.White,
    fontSize: TextUnit = 12.sp,
    text: String
) {
    Surface(
        shape = MaterialTheme.shapes.large,
        color = backgroundColor
    ) {
        Text(
            text = text.toUpperCase(Locale.current),
            color = textColor,
            modifier = modifier,
            fontSize = fontSize,
            style = parallaxTypography.caption,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PlaygroundTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Tag(
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp),
                text = "FEATURED",
                fontSize = 12.sp,
                backgroundColor = ParallaxRed,
                textColor = Color.White
            )
        }
    }
}