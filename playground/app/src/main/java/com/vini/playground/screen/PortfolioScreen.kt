package com.vini.playground.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.*
import androidx.navigation.NavHostController
import coil.annotation.ExperimentalCoilApi
import com.vini.playground.components.PortfolioCard
import com.vini.playground.data.PortfolioProject
import com.vini.playground.ui.theme.*

@ExperimentalUnitApi
@OptIn(ExperimentalCoilApi::class)
@Composable
fun PortfolioScreen(navController: NavHostController, list: List<PortfolioProject>) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(PortfolioBackground),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hello,\nI´m Vini Delgado.",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp, end = 32.dp, top = 32.dp),
                style = portfolioTypography.h5,
                color = PortfolioTextTitleColor,
            )
            Spacer(modifier = Modifier.height(12.dp))
            LazyColumn {
                items(list.size) { index ->
                    PortfolioCard(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 32.dp, vertical = 16.dp),
                        projectId = list[index].id,
                        tecnology = list[index].tecnology,
                        projectTitle = list[index].title,
                        description = list[index].description,
                        onPortfolioProjectTapped = {
                            navController.navigate(
                                when (it) {
                                    1 -> "parallax"
                                    2 -> "wellness"
                                    else -> "walkthrough"
                                }
                            )
                        }
                    )
                }
            }

        }
    }
}