package com.example.instagramapp.frutas

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FrutasScreen(modifier: Modifier = Modifier) {

    val frutas = listOf("Manzana", "Banana", "Naranja", "Pera")
    var selectedFrutaIndex by remember { mutableStateOf(0) }

    Column {

        FirstComposable(
            frutas,
            onItemSelected = { index -> selectedFrutaIndex = index },
            selectedFrutaIndex
        )

        Text(text = "Índice seleccionado en MyApp: $selectedFrutaIndex")
    }


}

@Composable
fun FirstComposable(
    frutas: List<String>,
    onItemSelected: (Int) -> Unit,
    selectedIndex: Int
) {
    Column {
        SecondComposable(frutas, onItemSelected, selectedIndex)
        Text(text = "Índice seleccionado en el primer Composable: $selectedIndex")
    }
}


@Composable
fun SecondComposable (
    frutas: List<String>,
    onItemSelected: (Int) -> Unit,
    selectedIndex: Int
) {
    Column {
        ThirdComposable(frutas, selectedIndex, onItemSelected)
        Text(text = "Índice seleccionado en el primer Composable: $selectedIndex")
    }
}

@Composable
fun ThirdComposable(
    frutas: List<String>,
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit
) {


    Column {

        FourComposable( frutas, selectedIndex, onItemSelected )

        Text(text = "Índice seleccionado en el tercer Composable: $selectedIndex")
    }
}


@Composable
fun FourComposable(
    frutas: List<String>,
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit
) {

    Column {
        Text("Selecciona una fruta en el Cuarto Composable:")
        LazyColumn {
            items(frutas) { fruta ->
                Text(
                    text = fruta,
                    modifier = Modifier
                        .clickable { onItemSelected(frutas.indexOf(fruta)) }
                        .padding(8.dp)
                        .background(if (frutas.indexOf(fruta) == selectedIndex) Color.Gray else Color.Transparent)
                )
            }
        }
    }

    Text(text = "Índice seleccionado en el cuarto Composable: $selectedIndex")
}

@Composable
@Preview(showBackground = true)
fun FrutasScreenPreview() {
    FrutasScreen()
}

