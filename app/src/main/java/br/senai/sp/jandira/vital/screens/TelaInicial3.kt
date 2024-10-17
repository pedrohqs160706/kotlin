package br.senai.sp.jandira.vital.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.vital.R
import br.senai.sp.jandira.vital.ui.theme.VitalTheme

@Composable
fun TelaInicial3(controleDeNavegacao: NavHostController) {
    Scaffold(
        content = { paddingValues ->
            Surface(modifier = Modifier.padding(paddingValues)) {
                Box(modifier = Modifier.fillMaxSize()) {
                    // Imagem
                    Image(
                        painter = painterResource(id = R.drawable.mulher),
                        contentDescription = null,
                        modifier = Modifier
                            .width(400.dp)
                            .height(800.dp)
                            .offset(y = 70.dp)
                    )

                    // Gradiente
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                brush = Brush.verticalGradient(
                                    colors = listOf(
                                        Color(0x3FFFFFF),
                                        Color(0x03FFFFFF),
                                        Color(0xFF0073DE),
                                        Color(0xFF0073DE)
                                    )
                                )
                            )
                    )

                    // Texto "Pular"
                    Column(
                        modifier = Modifier
                            .align(Alignment.TopEnd) // Alinha no topo à direita
                            .padding(20.dp) // Espaçamento
                    ) {
                        Text(
                            text = "Pular",
                            color = Color.Gray,
                            fontSize = 12.sp,
                        )
                    }

                    // Texto FINAIS
                    Column(
                        modifier = Modifier
                            .align(Alignment.BottomCenter) // Alinha ao centro na parte inferior
                            .padding(26.dp)
                            .padding(bottom = 16.dp), // Espaçamento inferior
                        horizontalAlignment = Alignment.CenterHorizontally // Alinha os textos ao centro
                    ) {
                        Text(
                            text = "Galeria de Vídeos",
                            fontSize = 16.sp,
                            color = Color.White
                        )

                        Text(
                            text = "Assista a vídeos interativos e informativos, cuidando da sua saúde sempre",
                            fontSize = 12.sp,
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )

                    }
                }
            }
        }
    )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaInicial3Preview() {
    VitalTheme {
        TelaInicial3(controleDeNavegacao = NavHostController(LocalContext.current))
    }
}