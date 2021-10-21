package com.vini.playground.data

data class PortfolioProject(
    val id: Int,
    val tecnology: String,
    val title: String,
    val description: String
)

val listProjects = listOf(
    PortfolioProject(
        1,
        "JETPACK COMPOSE | UI | TEST",
        "Parallax Effect",
        "A sample of detail screen using Parallax Effect"
    ),
    PortfolioProject(
        2,
        "JETPACK COMPOSE | UI | TEST",
        "Horizontal Animation Progressbar",
        "A sample of Wellness app using animation progressbar and lazy row."
    ),
    PortfolioProject(
        3,
        "JETPACK COMPOSE | UI | TEST",
        "Walkthrough App",
        "A sample of Walkthrough a financial app."
    )
)