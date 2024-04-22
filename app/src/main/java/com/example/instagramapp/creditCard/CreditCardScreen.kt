package com.example.instagramapp.creditCard

import android.view.SubMenu
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramapp.R
import com.example.instagramapp.balance.Balance
import com.example.instagramapp.creditCard.components.CredictCardAction
import com.example.instagramapp.creditCard.components.TheCard
import com.example.instagramapp.header.HeaderScreen
import com.example.instagramapp.submenu.SubMenu

@Composable
fun CreditCardScreen(modifier: Modifier = Modifier) {

    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {

        Column(Modifier.fillMaxWidth()) {
            HeaderScreen()
            Balance(987.65)
            TheCard(Modifier.padding(top = 10.dp))

            CredictCardAction(Modifier.padding(top = 30.dp))
        }


        SubMenu()

    }
}

@Composable
@Preview(showBackground = true)
fun CreditCardScreenPreview() {
    CreditCardScreen()
}
