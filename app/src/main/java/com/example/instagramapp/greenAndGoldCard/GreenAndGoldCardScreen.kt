package com.example.instagramapp.greenAndGoldCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagramapp.balance.Balance
import com.example.instagramapp.greenAndGoldCard.components.TheCards
import com.example.instagramapp.submenu.SubMenu
import java.util.concurrent.SubmissionPublisher

@Composable
fun GreenAndGoldCardScreen(){


    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween){

        Column {
            Text("Header")
            Balance(amount = 123456.98)

            TheCards()


        }
        SubMenu()
    }

}


@Composable
@Preview(showBackground = true)
fun GreenAndGoldCardScreenPreview(){
    GreenAndGoldCardScreen()
}