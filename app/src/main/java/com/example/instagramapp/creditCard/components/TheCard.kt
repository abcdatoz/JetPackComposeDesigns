package com.example.instagramapp.creditCard.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card

import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TheCard(modifier: Modifier = Modifier) {

    val textA = remember { mutableStateOf("Dolor Sill") }
    val textB = remember { mutableStateOf("MM/YY") }
    val textC = remember { mutableStateOf("CVV") }

    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {


        Card(
            modifier = modifier
                .width(370.dp)
                .height(250.dp),
            colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.gold))
        ) {


            Column(modifier.fillMaxWidth().padding(10.dp)) {

                Row(
                    modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text("lorem", color = Color.Gray, fontWeight = FontWeight.Bold)
                    Text("Ipsum", color = Color.LightGray)

                    Box(
                        modifier = modifier
                            .background(Color.White)
                            .padding(10.dp)
                            .clip(RoundedCornerShape(10.dp))
                    ) {
                        Text(text = "CARD", fontWeight = FontWeight.ExtraBold)
                    }

                }



                Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {

                    OutlinedTextField(
                        value = textA.value,
                        onValueChange = {},
                        placeholder = { Text("Dolor Soil") },
                        modifier = modifier.weight(1f)
                    )

                }



                Row(
                    modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {


                    OutlinedTextField(
                        value = textB.value,
                        onValueChange = {},
                        placeholder = { Text("MM/YY") },
                        modifier = modifier.weight(1f)
                    )

                    Spacer(modifier.size(10.dp))

                    OutlinedTextField(
                        value = textC.value,
                        onValueChange = {},
                        placeholder = { Text("CVV") },
                        modifier = modifier.weight(1f)
                    )

                }
            }

        }

    }
}


@Composable
@Preview(showBackground = true)
fun TheCardPreview() {
    TheCard()

}