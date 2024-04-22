package com.example.instagramapp.greenAndGoldCard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramapp.R
import com.example.instagramapp.tools.toMoney

@Composable
fun TheCards(modifier: Modifier = Modifier) {

    Column(modifier = modifier) {

        OneCard(R.color.gold, title = "lorem and lorem and lorem", amount = 17892.0)
        Spacer(modifier.height(20.dp))
        OneCard(R.color.green, title = "ipsum ipsum ipsum", amount = 17892.0)

    }

}

@Composable
fun OneCard(color: Int, title: String, amount: Double, modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceBetween

    ) {

        Text(title, color = Color.Gray)
        Spacer(modifier = modifier.size(16.dp))

        Card(
            colors = CardDefaults.cardColors(containerColor = colorResource(id = color)),
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
        ) {

            Column(
                modifier
                    .fillMaxSize()
                    .padding(horizontal = 10.dp),
                verticalArrangement = Arrangement.SpaceAround,

                ) {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Lorem", color = Color.White)
                    Text("CARD", color = Color.White)
                }
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        "LOREM IPSUM CARD  THEN",
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold
                    )
                }
                Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("07/25", color = Color.White)
                    Text(
                        toMoney(amount),
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold
                    )

                }

            }

        }


    }

}


@Composable
@Preview(showBackground = true)
fun TheCardsPreview() {
    TheCards()
}
