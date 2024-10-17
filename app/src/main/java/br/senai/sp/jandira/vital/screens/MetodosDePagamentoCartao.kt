package br.senai.sp.jandira.vital.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
                .fillMaxSize()
                .background(color = Color(0xffF6F6F6)),
            verticalArrangement = Arrangement.Top
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(color = Color(0xff2954C7))

            )

        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(color = Color.White),
            verticalArrangement = Arrangement.Bottom

        ) {

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

