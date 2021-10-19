package com.vini.playground.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vini.playground.ui.theme.*

@Composable
fun PortfolioCard(
    tecnology: String,
    projectTitle: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier, backgroundColor = PortfolioCardBackground) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(32.dp)
        ) {
            Text(
                text = tecnology,
                color = PortfolioTextTitleColor,
                style = portfolioTypography.caption
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = projectTitle,
                color = PortfolioTextTitleColor,
                style = portfolioTypography.subtitle1
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = description,
                color = PortfolioTextDescriptionBColor,
                style = portfolioTypography.subtitle2
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PortfolioCardPreview() {
    PlaygroundTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(PortfolioBackground),
            contentAlignment = Alignment.Center
        ) {
            val modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(32.dp)
            PortfolioCard(
                tecnology = "JETPACK COMPOSE",
                projectTitle = "Wellness Activities",
                description = "Create, calculate and format money in Jetpack Compose and UI Test",
                modifier = modifier
            )
        }
    }
}