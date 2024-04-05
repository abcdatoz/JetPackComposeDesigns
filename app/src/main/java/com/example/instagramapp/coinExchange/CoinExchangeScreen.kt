package com.example.instagramapp.coinExchange

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramapp.coinExchange.components.CoinExchangeBalance
import com.example.instagramapp.coinExchange.components.CoinExchangeConversor
import com.example.instagramapp.coinExchange.components.CoinExchangeSlider
import com.example.instagramapp.data.Coins
import com.example.instagramapp.header.HeaderScreen
import com.example.instagramapp.submenu.SubMenu
import com.example.instagramapp.tools.toMoney
import com.google.android.gms.wallet.button.ButtonConstants

@Composable
fun CoinExchangeScreen() {


    val lista = listOf(
        Coins("MXN", 1F),
        Coins("USD", 16.64F),
        Coins("Yen", 0.11F),
        Coins("Euro", 17.87F),
        Coins("Libra", 20.89F),
        Coins("Franco", 18.48F)
    )


    var selectedIndexA = remember { mutableStateOf(0) }
    var selectedIndexB = remember { mutableStateOf(0) }
    var amount = remember { mutableStateOf(0f) }

    var sliderPosition = remember { mutableFloatStateOf(0f) }


    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {


        HeaderScreen()

        CoinExchangeBalance(saldo = 987564.32)

        CoinExchangeConversor(
            lista,
            selectedIndexA,
            selectedIndexB,
            sliderPosition.value,
            amount,
            modifier = Modifier.padding(horizontal = 10.dp)
        )


        CoinExchangeSlider(
            sliderPosition,
            lista[selectedIndexA.value].value,
            lista[selectedIndexB.value].value,
            amount
        )





        Text(
            text = toMoney(amount.value.toDouble()),
            modifier = Modifier.padding(horizontal = 20.dp),
            fontSize = 30.sp, fontWeight = FontWeight.Bold
        )


        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){


            Button(
                onClick = { /* Do something when the button is clicked */ },
                colors = ButtonDefaults.buttonColors(Color.Black)
            ) {
                Text("Button Text")
            }
        }



        SubMenu()
    }
}

fun Convierte(valorA: Float, valorB: Float, valorC: Float): Float {

    if (valorA > valorB) {
        return ((valorA * valorB) * valorC)
    } else {
        return ((valorA / valorB) * valorC)
    }
}

@Composable
@Preview(showBackground = true)
fun CoinExchangeScreenPreview() {
    CoinExchangeScreen()
}