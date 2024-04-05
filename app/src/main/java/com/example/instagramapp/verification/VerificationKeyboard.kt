package com.example.instagramapp.verification

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun VerificationKeyboard(
    modifier: Modifier = Modifier
) {


    var lista = listOf(
        numeros("1", " "),
        numeros("2", "ABC"),
        numeros("3", "DEF"),
        numeros("4", "GHI"),
        numeros("5", "JKL"),
        numeros("6", "MNO"),
        numeros("7", "PQRS"),
        numeros("8", "TUV"),
        numeros("9", "XYZ"),
        numeros(".", " "),
        numeros("0", " "),
        numeros("X", " ")
    )


    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = modifier.fillMaxWidth(),
        contentPadding = PaddingValues(12.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)

    ) {

        items(lista) {
            Item(it)
        }
    }

}

@Composable
private fun Item(num: numeros, modifier: Modifier = Modifier) {


    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .background(Color.Gray)
            .width(120.dp)
            .height(50.dp)
    ) {

        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                num.numero,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp
            )
            Text(num.letras, color = Color.White)
        }

    }


}

@Preview(showBackground = true)
@Composable
fun VerificationKeyboardPreview() {
    VerificationKeyboard()
}


data class numeros(
    val numero: String,
    val letras: String
)