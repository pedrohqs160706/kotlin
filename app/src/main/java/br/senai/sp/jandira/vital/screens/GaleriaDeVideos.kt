package br.senai.sp.jandira.vital.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.vital.R
import br.senai.sp.jandira.vital.ui.theme.VitalTheme

// Simulando uma lista de vídeos com miniaturas
data class Video(val titulo: String, val thumbnailUrl: Int, val videoUrl: String)

val videoList = listOf(
    Video("Vídeo 1", R.drawable.mental, "https://video1.com"),
    Video("Vídeo 2", R.drawable.direitosdapessoaidosa, "https://video2.com"),
    Video("Vídeo 3", R.drawable.saudesexualfeminina, "https://video3.com")
)

@Composable
fun GaleriaDeVideos(onVideoClick: (Video) -> Unit) {
    VitalTheme {
        Column {
            // Cabeçalho com imagem de fundo
            Image(
                painter = painterResource(id = R.drawable.ondas),
                contentDescription = "Imagem de fundo",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(237.dp)
            )

            // Barra de pesquisa (simulada)
            Box(
                modifier = Modifier
                    .height(48.dp)
                    .width(327.dp)
                    .align(Alignment.CenterHorizontally)
                    .offset(y = -130.dp)
                    .background(color = Color.White, shape = RoundedCornerShape(16.dp))
            ) {
                Text(
                    "Pesquise por título",
                    fontSize = 12.sp,
                    color = Color.Gray,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 19.dp)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Exibição dos vídeos em uma galeria horizontal
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                items(videoList) { video ->
                    Card(
                        shape = RoundedCornerShape(12.dp),
                        elevation = CardDefaults.cardElevation(8.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        modifier = Modifier
                            .size(width = 160.dp, height = 100.dp)
                            .clickable {
                                onVideoClick(video) // Ação ao clicar no vídeo
                            }
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            // Miniatura do vídeo
                            Image(
                                painter = painterResource(id = video.thumbnailUrl),
                                contentDescription = "Miniatura do vídeo",
                                modifier = Modifier.fillMaxSize()
                            )

                            // Ícone de reprodução no centro
                            IconButton(
                                onClick = { onVideoClick(video) },
                                modifier = Modifier.size(40.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.PlayArrow,
                                    contentDescription = "Reproduzir vídeo",
                                    tint = Color.White
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun VideoChamadaPreview() {
    VitalTheme {
        GaleriaDeVideos { video ->
            // Ação quando o vídeo é clicado (exemplo de navegação ou reprodução)
            println("Clicado no vídeo: ${video.titulo}")
        }
    }
}
