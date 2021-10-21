package com.vini.playground.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.vini.playground.R

private val fonts = FontFamily(
    Font(R.font.poppins_regular),
    Font(R.font.poppins_medium, FontWeight.W500),
    Font(R.font.poppins_bold, FontWeight.Bold)
)

private val fontsMontserrat = FontFamily(
    Font(R.font.montserrat_regular),
    Font(R.font.montserrat_semibold, FontWeight.SemiBold),
    Font(R.font.montserrat_bold, FontWeight.Bold)
)

private val fontsGothic = FontFamily(
    Font(R.font.gothic_regular),
    Font(R.font.gothic_semibold, FontWeight.SemiBold),
    Font(R.font.gothic_bold, FontWeight.Bold)
)

private val fontsArchivo = FontFamily(
    Font(R.font.archivo_semibold),
    Font(R.font.archivo_semibold, FontWeight.SemiBold),
    Font(R.font.archivo_semibold, FontWeight.Bold)
)


private val fontsTest = FontFamily(
    Font(R.font.festive_regular),
    Font(R.font.festive_regular, FontWeight.SemiBold),
    Font(R.font.festive_regular, FontWeight.Bold)
)

val mobileCrypto = Typography(
    subtitle1 = TextStyle(
        fontFamily = fontsArchivo,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    )
)

val progressBarTypography = Typography(
    caption = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    h4 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = 46.sp
    ),
    h5 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
)

val parallaxTypography = Typography(
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    h4 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 46.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
)

val portfolioTypography = Typography(
    h5 = TextStyle(
        fontFamily = fontsGothic,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        textAlign = TextAlign.Left
    ),
    caption = TextStyle(
        fontFamily = fontsGothic,
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp,
        letterSpacing = 1.sp,
        textAlign = TextAlign.Left
    ),
    subtitle1 = TextStyle(
        fontFamily = fontsGothic,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        textAlign = TextAlign.Left
    ),
    subtitle2 = TextStyle(
        fontFamily = fontsGothic,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        textAlign = TextAlign.Left
    ),
)

val walkthroughTypography = Typography(
    h4 = TextStyle(
        fontFamily = fontsMontserrat,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = fontsMontserrat,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = fontsMontserrat,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    ),
    button = TextStyle(
        fontFamily = fontsMontserrat,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
)


// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)