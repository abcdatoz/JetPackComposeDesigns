package com.example.instagramapp.creditCards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagramapp.creditCards.components.MainCard
import com.example.instagramapp.header.HeaderScreen
import com.example.instagramapp.submenu.SubMenu

@Composable
fun CreditCardsScreen(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween ){

        Column (Modifier.fillMaxWidth()) {
            HeaderScreen()

            MainCard()
        }


        SubMenu()

    }
}

@Composable
@Preview (showBackground = true)
fun CreditCardsScreenPreview(){

    CreditCardsScreen()
}