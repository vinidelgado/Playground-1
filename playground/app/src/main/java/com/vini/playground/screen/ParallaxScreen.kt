package com.vini.playground.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.vini.playground.R
import com.vini.playground.components.Tag
import com.vini.playground.ui.theme.ParallaxRed
import com.vini.playground.ui.theme.PlaygroundTheme
import com.vini.playground.ui.theme.parallaxTypography
import kotlin.math.min

@OptIn(ExperimentalCoilApi::class)
@Composable
fun ParallaxScreen() {
    val scrollState = rememberScrollState()
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black, RectangleShape)
    ) {
        val (parallaxImage, parallaxBottomOpacity) = createRefs()
        Image(
            painter = rememberImagePainter(R.drawable.img_kobe),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .graphicsLayer {
                    alpha = min(1f, 1 - (scrollState.value / 600f))
                    translationY = -scrollState.value * 0.1f
                }
                .constrainAs(parallaxImage) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        )
                    ), RectangleShape
                )
                .constrainAs(parallaxBottomOpacity) {
                    bottom.linkTo(parallaxImage.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .verticalScroll(scrollState)
        ) {
            Spacer(modifier = Modifier.height(200.dp))
            Tag(
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp),
                text = "FEATURED",
                fontSize = 12.sp,
                backgroundColor = ParallaxRed,
                textColor = Color.White
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "Remembering Kobe Bryant",
                color = Color.White,
                style = parallaxTypography.h4
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "The text from an unfamiliar 949 number arrived at some ungodly hour in" +
                        " the spring of 2016. I don't have it anymore. I wish I did.\n" +
                        "\n" +
                        "\"It's Kobe. Call me.\"\n" +
                        "\n" +
                        "I assumed it was a hoax. I called my colleague Ramona Shelburne. " +
                        "I recited the number. She said it was the real Kobe.\n" +
                        "\n" +
                        "I pivoted into fear. I started covering the NBA in 2010 as Kobe Bryant " +
                        "entered his twilight. It went downhill fast. An Achilles tear -- one that " +
                        "seemed to barely register to Kobe as a serious injury when it happened" +
                        " -- hastened the end.\n" +
                        "\n" +
                        "Even before his injuries, I had been hard on Kobe from afar. His style of " +
                        "play had grown antiquated. As retirement neared, I argued Bryant was " +
                        "perhaps a hair overrated in historical debates. Had he heard and read " +
                        "that stuff?\n" +
                        "\n" +
                        "What I found out when I called him was that even if Bryant had read any of " +
                        "it, he had bigger things on his mind -- grand plans to put in motion.\n" +
                        "\n" +
                        "He told me that as he neared retirement, he was growing concerned about " +
                        "media coverage of the NBA. He felt in the endless focus on legacy and " +
                        "championships and trade machinations, the game itself -- the craft, the " +
                        "beauty -- was getting lost. The unofficial winner of #RINGZ discourse " +
                        "was tired of it.\n" +
                        "\n" +
                        "He appreciated that I tried to write about X's and O's. He wanted to meet " +
                        "and discuss the future of media coverage.\n" +
                        "\n" +
                        "He invited me to his office in Newport Beach, California, to watch Game " +
                        "5 of the Eastern Conference finals, on May 25, 2016. I was petrified. " +
                        "This was a basketball test administered by Kobe Bryant. How many staff " +
                        "members and assistants were going to witness my humiliation?\n" +
                        "\n" +
                        "I also felt ambivalent entering his orbit. It was and is impossible to " +
                        "separate Bryant the basketball supernova from the man who was accused, " +
                        "in 2003, of sexually assaulting a 19-year-old woman in a Colorado hotel. " +
                        "Fourteen months later, prosecutors dropped the criminal charge when the " +
                        "woman declined to continue to participate in the case after a series of " +
                        "courthouse errors, including the release of her name. (Bryant and the " +
                        "woman subsequently settled her civil suit out of court.) Bryant issued a " +
                        "written apology, saying in part, \"Although I truly believe this encounter " +
                        "between us was consensual, I recognize now that she did not and does not " +
                        "view this incident the same way I did.\" That was a real and serious " +
                        "concession. It is hard to reckon with now.\n" +
                        "\n" +
                        "I was uneasy when I knocked on the door of his office. He answered. He " +
                        "took me to a conference room with a giant TV. It was me and Kobe. An " +
                        "assistant left after bringing a six-pack of beer. Kobe asked if I " +
                        "wanted to split it.",
                color = Color.White,
                lineHeight = 28.sp,
                style = parallaxTypography.subtitle1
            )
            Spacer(modifier = Modifier.height(24.dp))

        }
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
            ParallaxScreen()
        }
    }
}