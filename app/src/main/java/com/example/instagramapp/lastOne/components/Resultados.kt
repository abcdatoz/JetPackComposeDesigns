package com.example.instagramapp.lastOne.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramapp.tools.toMoney

@Composable
fun Resultados(modifier: Modifier = Modifier) {

    Column(modifier = modifier.fillMaxWidth()) {

        Resultado("cta6712323", 123.0, Color.Magenta)
        Resultado("cta6834939", 999.99, Color.Green)
        Resultado("cta011001011", 1010101.03, Color.Magenta)
        Resultado("cta683sda", -50.99, Color.Green)
    }
}

@Composable
fun Resultado(acount: String, amount: Double, color: Color, modifier: Modifier = Modifier) {

    Row(
        modifier = modifier.fillMaxWidth().padding(top = 20.dp).border(2.dp, Color.Gray),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = modifier) {
            Text(acount, color = Color.LightGray)
            Text("Lorem Ipsum", fontWeight = FontWeight.ExtraBold)
        }

        Text(toMoney(amount), color = color)


    }
}

@Composable
@Preview(showBackground = true)
fun ResultadosPreview() {
    Resultados()
}