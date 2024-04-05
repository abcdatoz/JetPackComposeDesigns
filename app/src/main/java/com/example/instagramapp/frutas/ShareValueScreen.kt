package com.example.instagramapp.frutas

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ShareValueScreen(modifier: Modifier = Modifier){


    val dolar = remember { mutableStateOf(0) }
    val pesos = remember {        mutableStateOf(0)    }

    val resultado = remember { derivedStateOf {


        if (dolar.value < 5) {
            (dolar.value * 20) + pesos.value
        } else {
            (dolar.value * 18) + pesos.value
        }

    }}


    Column {
        Text("Dolares: ${ dolar.value }")
        Text("Pesos: ${ pesos.value }")
        Text("Resultado: ${ resultado.value }")

        Apple(valor = dolar)
        Mango(valor = pesos)
    }
}


@Composable
fun Apple (valor: MutableState<Int>){
    
    Citrix(valor = valor)
}

@Composable
fun Citrix (valor:MutableState<Int>){
    Button(onClick = {
        valor.value += 1
    }) {
        Text(text = "Click Me to increase")
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Mango(valor: MutableState<Int>)
{


    OutlinedTextField(
        value = valor.value.toString(),
        onValueChange = { newText ->
            valor.value = newText.toInt()
        },
        label = {  }
    )

}


@Composable
@Preview(showBackground = true)
fun ShareValueScreenPreview(){
    ShareValueScreen()
}


