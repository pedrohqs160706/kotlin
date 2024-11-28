package br.senai.sp.jandira.vital.screens


import android.util.Log
import android.widget.Space
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
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import br.senai.sp.jandira.vital.R
import br.senai.sp.jandira.vital.model.Login
import br.senai.sp.jandira.vital.model.Usuario
import br.senai.sp.jandira.vital.repository.CategoriaRepository
import br.senai.sp.jandira.vital.service.RetrofitFactory
import br.senai.sp.jandira.vital.ui.theme.VitalTheme
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response




@Composable
fun HistoricoDeConsultas() {

    val categoria = CategoriaRepository().mostrarTodasAsCategorias()

    VitalTheme {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xffEAEAEA))
        ){
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)
                    .background(
                        color = Color(0xff2954C7),
                        shape = RoundedCornerShape(bottomStart = 7.dp, bottomEnd = 7.dp)
                    )
            ){


                    
                    Image(
                        painter = painterResource(R.drawable.setaesq),
                        contentDescription = "",
                        modifier = Modifier
                            .width(20.dp)
                            .height(20.dp)
                            .offset(y = 15.dp, x = 10.dp)

                    )

                    Text(
                        "Consultas",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)

                    )

                Spacer(modifier = Modifier.height(40.dp))

                Column (
                    modifier = Modifier
                        .height(23.dp)
                        .width(93.dp)
                        .background(color = Color(0xffC6E1FF), shape = RoundedCornerShape(10.dp))
                        .align(alignment = Alignment.CenterHorizontally)
                ){

                    Text(
                        "Histórico",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                    )
                }


            }

            Text(
                "Próximas",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .padding(top = 10.dp, start = 20.dp)
            )

            Column (
                modifier = Modifier
                    .width(355.dp)
                    .height(131.dp)
                    .padding(top = 10.dp)
                    .background(color = Color(0xffFFFFFF), shape = RoundedCornerShape(6.dp))
                    .align(alignment = Alignment.CenterHorizontally)

            ) {
                Row {

                    Text(
                        "Especialidade:",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier
                            .padding(top = 10.dp, start = 15.dp)
                    )

                    Spacer(modifier = Modifier.width(225.dp))

                    Image(
                        painter = painterResource(R.drawable.opcoes),
                        contentDescription = "",
                        modifier = Modifier
                            .width(50.dp)
                            .height(30.dp)

                    )
                }

                Text(
                    "Médico:",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xff0073DE),
                    modifier = Modifier
                        .padding(start = 15.dp)
                )

                Text(
                    "Data:",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(start = 15.dp)
                )

                Row {

                    Column(
                        modifier = Modifier
                            .width(111.dp)
                            .height(27.dp)
                            .padding(start = 15.dp)
                            .background(
                                color = Color(0xffFAF2AB),
                                shape = RoundedCornerShape(10.dp)
                            )
                    ) {
                        Text(
                            "Em andamento",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                                .align(alignment = Alignment.CenterHorizontally)
                        )
                    }

                    Spacer(modifier = Modifier.width(160.dp))

                    Text(
                        "Horário:",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }

            Text(
                "Anteriores",
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp)
            )

            Column (
                modifier = Modifier
                    .width(355.dp)
                    .height(131.dp)
                    .padding(top = 10.dp)
                    .background(color = Color(0xffFFFFFF), shape = RoundedCornerShape(6.dp))
                    .align(alignment = Alignment.CenterHorizontally)

            ){
                Row {

                    Text(
                        "Especialidade:",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier
                            .padding(top = 10.dp, start = 15.dp)
                    )

                    Spacer(modifier = Modifier.width(225.dp))

                    Image(
                        painter = painterResource(R.drawable.opcoes),
                        contentDescription = "",
                        modifier = Modifier
                            .width(50.dp)
                            .height(30.dp)

                    )
                }

                Text(
                    "Médico:",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xff0073DE),
                    modifier = Modifier
                        .padding(start = 15.dp)
                )

                Text(
                    "Data:",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(start = 15.dp)
                )

                Row {

                    Column(
                        modifier = Modifier
                            .width(111.dp)
                            .height(27.dp)
                            .padding(start = 15.dp)
                            .background(
                                color = Color(0xff54FF51),
                                shape = RoundedCornerShape(10.dp)
                            )
                    ) {
                        Text(
                            "Concluída",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                                .align(alignment = Alignment.CenterHorizontally)
                        )
                    }

                    Spacer(modifier = Modifier.width(160.dp))

                    Text(
                        "Horário:",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }

            Column (
                modifier = Modifier
                    .width(355.dp)
                    .height(131.dp)
                    .padding(top = 10.dp)
                    .background(color = Color(0xffFFFFFF), shape = RoundedCornerShape(6.dp))
                    .align(alignment = Alignment.CenterHorizontally)

            ){
                Row {

                    Text(
                        "Especialidade:",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier
                            .padding(top = 10.dp, start = 15.dp)
                    )

                    Spacer(modifier = Modifier.width(225.dp))

                    Image(
                        painter = painterResource(R.drawable.opcoes),
                        contentDescription = "",
                        modifier = Modifier
                            .width(50.dp)
                            .height(30.dp)

                    )
                }

                Text(
                    "Médico:",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xff0073DE),
                    modifier = Modifier
                        .padding(start = 15.dp)
                )

                Text(
                    "Data:",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(start = 15.dp)
                )

                Row {

                    Column(
                        modifier = Modifier
                            .width(111.dp)
                            .height(27.dp)
                            .padding(start = 15.dp)
                            .background(
                                color = Color(0xffFC4D4D),
                                shape = RoundedCornerShape(10.dp)
                            )
                    ) {
                        Text(
                            "Cancelada",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                                .align(alignment = Alignment.CenterHorizontally)
                        )
                    }

                    Spacer(modifier = Modifier.width(160.dp))

                    Text(
                        "Horário:",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }

            Column (
                modifier = Modifier
                    .width(355.dp)
                    .height(131.dp)
                    .padding(top = 10.dp)
                    .background(color = Color(0xffFFFFFF), shape = RoundedCornerShape(6.dp))
                    .align(alignment = Alignment.CenterHorizontally)

            ){
                Row {

                    Text(
                        "Especialidade:",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier
                            .padding(top = 10.dp, start = 15.dp)
                    )

                    Spacer(modifier = Modifier.width(225.dp))

                    Image(
                        painter = painterResource(R.drawable.opcoes),
                        contentDescription = "",
                        modifier = Modifier
                            .width(50.dp)
                            .height(30.dp)

                    )
                }

                Text(
                    "Médico:",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xff0073DE),
                    modifier = Modifier
                        .padding(start = 15.dp)
                )

                Text(
                    "Data:",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(start = 15.dp)
                )

                Row {

                    Column(
                        modifier = Modifier
                            .width(111.dp)
                            .height(27.dp)
                            .padding(start = 15.dp)
                            .background(
                                color = Color(0xffBCBCBC),
                                shape = RoundedCornerShape(10.dp)
                            )
                    ) {
                        Text(
                            "Não compareceu",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                                .align(alignment = Alignment.CenterHorizontally)
                        )
                    }

                    Spacer(modifier = Modifier.width(160.dp))

                    Text(
                        "Horário:",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }

        }


    }


}



@Preview (showBackground = true, showSystemUi = true)
@Composable
fun HistoricoDeConsultasPreview () {


    // Pre-visualizacao
    VitalTheme {
        HistoricoDeConsultas()
    }




}

