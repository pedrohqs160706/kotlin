package br.senai.sp.jandira.vital.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.vital.R
import br.senai.sp.jandira.vital.ui.theme.VitalTheme
import okhttp3.internal.wait


@Composable
fun EdicaoDoFeedback() {



    VitalTheme {

        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xffC6E1FF)),
            verticalArrangement = Arrangement.Bottom
        ){

            Image(
                painter = painterResource(R.drawable.setaesq),
                contentDescription = "",
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp)
                    .offset(x = 10.dp, y = 10.dp)
            )

            Image(
                painter = painterResource(R.drawable.medica),
                contentDescription = "",
                modifier = Modifier
                    .width(242.dp)
                    .height(354.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(490.dp)
                    .background(color = Color.White, shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp ))
                    .align(Alignment.CenterHorizontally)


            ) {

                Spacer(modifier = Modifier.height(28.dp))


                Text(
                    "Dr. Lara Silva Costa",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)

                )

                Spacer(modifier = Modifier.height(5.dp))


                Text(
                    "Dermatologista",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xffA09C9C),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                )

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                ){
                    Image(
                        painter = painterResource(R.drawable.estrela),
                        contentDescription = "",
                        modifier = Modifier
                            .width(35.dp)
                            .height(35.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.estrela),
                        contentDescription = "",
                        modifier = Modifier
                            .width(35.dp)
                            .height(35.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.estrela),
                        contentDescription = "",
                        modifier = Modifier
                            .width(35.dp)
                            .height(35.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.estrelaapagada),
                        contentDescription = "",
                        modifier = Modifier
                            .width(35.dp)
                            .height(35.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.estrelaapagada),
                        contentDescription = "",
                        modifier = Modifier
                            .width(35.dp)
                            .height(35.dp)
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                Box(
                    modifier = Modifier
                        .width(250.dp)
                        .height(195.dp)
//                        .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                        .align(Alignment.CenterHorizontally)
                        .shadow(2.dp, shape = RoundedCornerShape(12.dp))
                ){
                    Text(
                        "Uma excelente médica, trabalha com dedicação, cuidado e profissionalismo. Todas minhas consultas são com ela, nunca mais marco com outra pessoa, ela mudou a minha vida e a minha saúde",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier
                            .padding(start = 18.dp, top = 18.dp)
                    )
                }

//                Spacer(modifier = Modifier.height(20.dp))
//
//                Button(onClick = { /*TODO*/ },
//                    modifier = Modifier
//                        .height(43.dp)
//                        .width(318.dp)
//                        .align(Alignment.CenterHorizontally),
//                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0174DE)),
//                    shape = RoundedCornerShape(16.dp)
//                ) {
//                    // Texto dentro do botao
//                    Text(
//                        text = "Continuar",
//                        fontSize = 14.sp,
//                        fontWeight = FontWeight.Bold,
//                        color = Color.White
//
//                    )
//
//                }

                Button(
                    onClick = { /* Ação ao clicar no botão */ },
                    modifier = Modifier
                        .padding(16.dp) // Espaçamento ao redor do botão
                        .height(43.dp) // Altura do botão
                        .width(318.dp) // Largura do botão
                        .align(Alignment.CenterHorizontally)
                        .shadow(2.dp, shape = RoundedCornerShape(12.dp)), // Sombra com elevação de 8dp e cantos arredondados
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0174DE)), // Cor de fundo do botão
                    shape = RoundedCornerShape(12.dp) // Cantos arredondados no botão
                ) {
                    Text(
                        text = "Salvar Alterações",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        }

    }


}



@Preview (showBackground = true, showSystemUi = true)
@Composable
fun EdicaoDoFeedbackPreview () {


    // Pre-visualizacao
    VitalTheme {
        EdicaoDoFeedback()
    }




}

