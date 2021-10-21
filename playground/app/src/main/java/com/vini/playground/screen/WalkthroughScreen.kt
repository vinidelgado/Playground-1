package com.vini.playground.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.google.accompanist.pager.*
import com.vini.playground.R
import com.vini.playground.components.WalkthroughButton
import com.vini.playground.ui.theme.PlaygroundTheme
import com.vini.playground.ui.theme.WalkthroughIndicatorActive
import com.vini.playground.ui.theme.WalkthroughIndicatorInactive
import com.vini.playground.ui.theme.walkthroughTypography

@ExperimentalPagerApi
@Composable
fun WalkthroughScreen() {
    WalkthroughPager()
}

@ExperimentalPagerApi
@Composable
fun WalkthroughPager() {
    Column(Modifier.fillMaxSize()) {
        val pagerState = rememberPagerState()

        HorizontalPager(
            count = 3,
            state = pagerState,
            modifier = Modifier
                .fillMaxSize()
        ) { page ->
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                WalkthroughItem(
                    page = page,
                    pagerState = pagerState,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                )
            }
        }
    }
}

@ExperimentalPagerApi
@Composable
fun WalkthroughItem(page: Int, modifier: Modifier = Modifier, pagerState: PagerState) {
    Column(
        modifier = modifier, verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Financy", color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            style = walkthroughTypography.h4,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(72.dp))
        WalkthroughItemImage(page = page)
        Spacer(modifier = Modifier.height(24.dp))
        HorizontalPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
            activeColor = WalkthroughIndicatorActive,
            inactiveColor = WalkthroughIndicatorInactive,
            indicatorWidth = 12.dp,
            indicatorHeight = 6.dp,
            indicatorShape = RoundedCornerShape(12.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        WalkthroughItemTitle(page = page)
        Spacer(modifier = Modifier.height(16.dp))
        WalkthroughItemSubtitle(page = page)
        Spacer(modifier = Modifier.height(56.dp))
        WalkthroughItemButton(page = page)
    }
}

@Composable
fun WalkthroughItemImage(page: Int) {
    val drawable = when (page) {
        0 -> R.drawable.walktrough_save_money
        1 -> R.drawable.walkthrough_check_wallet
        else -> R.drawable.walkthrough_access
    }
    Image(
        painter = rememberImagePainter(drawable),
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.4f)
    )
}

@Composable
fun WalkthroughItemTitle(page: Int) {
    val text = when (page) {
        0 -> R.string.walkthrough_title_one
        1 -> R.string.walkthrough_title_two
        else -> R.string.walkthrough_title_three
    }
    Text(
        text = stringResource(text),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp),
        style = walkthroughTypography.subtitle1,
        textAlign = TextAlign.Center
    )
}

@Composable
fun WalkthroughItemSubtitle(page: Int) {
    val text = when (page) {
        0 -> R.string.walkthrough_subtitle_one
        1 -> R.string.walkthrough_subtitle_two
        else -> R.string.walkthrough_subtitle_three
    }
    Text(
        stringResource(text),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp),
        style = walkthroughTypography.subtitle2,
        textAlign = TextAlign.Center
    )
}

@Composable
fun WalkthroughItemButton(page: Int) {
    val text = when (page) {
        0 -> R.string.walkthrough_button_one
        1 -> R.string.walkthrough_button_two
        else -> R.string.walkthrough_button_three
    }
    WalkthroughButton(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(horizontal = 16.dp),
        text = stringResource(id = text)
    )
}