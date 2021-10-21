package com.vini.playground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.vini.playground.data.listProjects
import com.vini.playground.screen.ParallaxScreen
import com.vini.playground.screen.PortfolioScreen
import com.vini.playground.screen.WalkthroughScreen
import com.vini.playground.screen.WellnessScreen
import com.vini.playground.ui.theme.PlaygroundTheme

@ExperimentalUnitApi
@ExperimentalPagerApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlaygroundTheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = "main") {
                    composable("main") { PortfolioScreen(navController, listProjects) }
                    composable("parallax") { ParallaxScreen() }
                    composable("walkthrough") { WalkthroughScreen() }
                    composable("wellness") { WellnessScreen() }
                }
            }
        }
    }
}