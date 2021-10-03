package com.vini.playground

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vini.playground.components.Tag
import com.vini.playground.ui.theme.ParallaxRed
import com.vini.playground.ui.theme.PlaygroundTheme
import org.junit.Rule
import org.junit.Test

class TagTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testReceiveTextAllCaps() {
        composeTestRule.setContent {
            PlaygroundTheme {
                Tag(
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp),
                    text = "featured",
                    fontSize = 12.sp,
                    backgroundColor = ParallaxRed,
                    textColor = Color.White
                )
            }
        }
        val tag = composeTestRule.onNode(hasText("FEATURED", ignoreCase = false))
        tag.assertIsDisplayed()
    }
}
