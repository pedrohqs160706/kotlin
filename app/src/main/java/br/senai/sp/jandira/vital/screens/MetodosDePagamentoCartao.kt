package br.senai.sp.jandira.vital.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.vital.R
import br.senai.sp.jandira.vital.ui.theme.VitalTheme


@Composable
fun MetodosDePagamentoCartao() {

    VitalTheme {

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .background(color = Color(0xff2954C7), shape = RoundedCornerShape(bottomEnd = 7.dp, bottomStart = 7.dp))
        ){

            Text(
                "Pagamento",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top = 20.dp)
            )

            Image(
                painter = painterResource(R.drawable.setaesq),
                contentDescription = "",
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp)

            )

        }

            }
//                Spacer(modifier = Modifier.weight(1f)) // Um espaço vazio que empurra o botão para baixo
//                verticalArrangement = Arrangement.Bottom // Posiciona os elementos no final da tela

//                Botao para Salvar a alteracao


        }








@Preview (showBackground = true, showSystemUi = true)
@Composable
fun MetodosDePagamentoCartaoPreview () {


    // Pre-visualizacao
    VitalTheme {
        MetodosDePagamentoCartao()
    }




}

