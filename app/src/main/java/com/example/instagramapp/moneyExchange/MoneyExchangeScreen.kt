package com.example.instagramapp.moneyExchange

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagramapp.data.Coins
import com.example.instagramapp.moneyExchange.components.MoneyExchangeLists

@Composable
fun MoneyExchangeScreen(modifier: Modifier = Modifier){


    val lista = listOf(
        Coins("MXN",1F),
        Coins("USD", 16.64F),
        Coins ("Yen", 0.11F),
        Coins("Euro", 17.87F),
        Coins("Libra", 20.89F),
        Coins("Franco", 18.48F)
    )

    Column (modifier = Modifier.fillMaxWidth()){

        MoneyExchangeLists(lista)
    }

}


@Composable
@Preview(showBackground = true)
fun MoneyExchangeScreenPreview(){
    MoneyExchangeScreen()
}