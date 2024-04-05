package com.example.instagramapp.Incomes.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.text.NumberFormat
import java.util.Locale

@Composable
fun IncomesOutcomes(modifier: Modifier = Modifier){

    Column (modifier = modifier.fillMaxWidth()) {

        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center

        ){

            Boxo("lorem",654465)
            Boxo("ipsum",1232879)
        }
    }
}

@Composable
private fun Boxo(title: String, amount: Int,  modifier:Modifier = Modifier){
    Box(){
        Column (modifier = modifier
            .width(200.dp)
            .border(1.dp, Color.Gray)
            .padding(10.dp)

        ){

            Text(title)
            Text( formatoMoneda(amount)  , color = Color.Green, fontWeight = FontWeight.Bold)
        }
    }
}

private fun formatoMoneda(cantidad: Int): String{

    val format = NumberFormat.getCurrencyInstance(Locale.US)

    val formatedNumber = format.format(cantidad)


    return formatedNumber
}

@Composable
@Preview(showBackground = true)
fun IncomesOutcomesPreview()
{
    IncomesOutcomes()
}