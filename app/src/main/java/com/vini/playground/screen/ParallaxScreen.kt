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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
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
        )

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
            Text(text = "Remembering Kobe Bryant", color = Color.White, style = parallaxTypography.h4)
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Kobe Bean Bryant (Filadélfia, 23 de agosto de 1978 — Calabasas, 26 de janeiro de 2020)[1] foi um jogador profissional de basquetebol estadunidense. Jogou toda sua carreira como ala-armador no Los Angeles Lakers da National Basketball Association (NBA). Filho de Joe Bryant, ex-jogador do Philadelphia 76ers e antigo técnico do time Los Angeles Sparks da WNBA, é considerado um dos maiores jogadores de todos os tempos.[2][3][4][5] Por outro lado, críticos alegam suas baixas porcentagens de arremessos de campo, de dois e três pontos (ao longo de sua carreira, teve média de 44% em arremessos de dois e 32% em triplos, que até caem nos playoffs), que fazem dele o jogador com mais arremessos perdidos na história da NBA: 14 481 arremessos de campo perdidos na temporada regular (marcou 11 719 de um total de 26 200 arremessos) e 2 485 (marcou 2 014 dum total de 4 499 arremessos nos playoffs), totalizando 16 966 arremessos perdidos.[6]\n" +
                        "\n" +
                        "Foi um dos poucos atletas a ser escolhido no recrutamento da NBA direto do ensino médio para a liga norte-americana. Ao longo de 20 anos de carreira, ganhou cinco campeonatos da NBA, participou 18 vezes do All-Star Game (recorde absoluto), foi eleito 15 vezes como membro da Equipe ideal da NBA, 12 vezes como membro da All-Defensive Team da NBA e foi o Jogador Mais Valioso (MVP) da NBA em 2008.\n" +
                        "\n" +
                        "Kobe, junto com o pivô Shaquille O'Neal e o técnico Phil Jackson, levou os Lakers a três campeonatos consecutivos da NBA, a chamada ‘dinastia’ nos Estados Unidos – 2000, 2001 e 2002. Após a temporada 2003–04, Shaquille O'Neal saiu do time e Kobe tornou-se a estrela principal do time de Los Angeles, sendo o cestinha da liga por duas temporadas consecutivas: 2005–06 e 2006–07. Nessas temporadas, quebrou vários recordes pessoais e da liga. Em 2006, fez 81 pontos num jogo contra o Toronto Raptors, segunda maior pontuação de todos os tempos, atrás somente dos 100 pontos de Wilt Chamberlain, marcados numa partida em 1962. Contudo, há analistas da NBA que defendem que o desempenho de Kobe foi melhor.[7][8]",
                color = Color.White,
                lineHeight = 28.sp,
                style = parallaxTypography.subtitle1
            )

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