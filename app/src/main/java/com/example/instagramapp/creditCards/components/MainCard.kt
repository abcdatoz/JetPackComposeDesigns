package com.example.instagramapp.creditCards.components

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainCard(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {

        Text("Vallar Dohaeris, Vallar morghullis ")

        Card(modifier = modifier.padding(10.dp)) {
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { /*TODO*/ }, modifier.weight(1f)) {
                    Icon(Icons.Default.Menu, "")
                }

                Text("Dolor ipsum doesnt feel real", modifier.weight(4f))

            }
        }


        Spacer(modifier.height(20.dp))
        Text("lorem ipsum is all what i have..... men")

        SecondCard(terminacion = "2314")
        SecondCard(terminacion = "9875")


    }
}

@Composable
fun SecondCard(terminacion: String, modifier: Modifier = Modifier) {

    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(10.dp)
    ) {

        Row(
            modifier
                .fillMaxWidth()
                .height(120.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            IconButton(onClick = { /*TODO*/ }, modifier.weight(1f)) {
                Icon(Icons.Filled.Menu, "Credit Card")
            }

            Column(modifier.weight(4f), verticalArrangement = Arrangement.Center) {

                Row() {
                    Text("**** **** **** ", fontSize = 30.sp, textAlign = TextAlign.End)
                    Text(terminacion, fontSize = 30.sp)
                }

                Text(text = "Lorem Ipsum da da da")

            }


        }

    }

}


@Composable
@Preview(showBackground = true)
fun MainCardPreview() {
    MainCard()
}
