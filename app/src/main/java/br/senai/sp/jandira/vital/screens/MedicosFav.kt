package br.senai.sp.jandira.vital.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.vital.R
import br.senai.sp.jandira.vital.ui.theme.VitalTheme


@Composable
fun MedicosFav() {



    VitalTheme {

        Box(
            modifier = Modifier
                .background(
                    Color(0xFF2954C7),
                    shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)
                )
                .fillMaxWidth()
                .height(100.dp)
        ){

            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "",
                tint = Color(0xFFFFFFFF),
                modifier = Modifier
                    .align(Alignment.CenterStart) // Alinha à esquerda, centralizado verticalmente
                    .padding(start = 16.dp) // Adiciona um espaçamento à esquerda
            )
            Text(
                "Dermatologistas",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .align(Alignment.Center) // Centraliza no meio
            )



        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .offset(y = 110.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .padding(start = 16.dp, end = 16.dp)
                    .background(color = Color.Red, shape = RoundedCornerShape(16.dp))
            ){

                Row (
                    modifier = Modifier
                        .offset(y = 10.dp)
                ){

                    Text(
                        "Pesquise por médico",
                        fontSize = 12.sp,
                        color = Color(0xffA09C9C),
                    modifier = Modifier
                        .padding(start = 25.dp)
                    )

                    Spacer(modifier = Modifier.width(190.dp))

                    Image(
                        painter = painterResource(R.drawable.lupa),
                        contentDescription = "",
                        modifier = Modifier
                            .width(10.dp)
                            .height(10.dp)
                            .align(alignment = Alignment.CenterVertically)
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp) // Define a espessura da borda
                        .background(Color.Gray)
                        .padding(top = 80.dp)// Define a cor da borda como cinza
                )
            }

            }
//                Spacer(modifier = Modifier.weight(1f)) // Um espaço vazio que empurra o botão para baixo
//                verticalArrangement = Arrangement.Bottom // Posiciona os elementos no final da tela

//                Botao para Salvar a alteracao




        }


    }






@Preview (showBackground = true, showSystemUi = true)
@Composable
fun MedicosFavPreview () {


    // Pre-visualizacao
    VitalTheme {
        MedicosFav()
    }




}

