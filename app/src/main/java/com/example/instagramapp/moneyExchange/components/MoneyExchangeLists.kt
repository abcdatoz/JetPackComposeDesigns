package com.example.instagramapp.moneyExchange.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramapp.data.Coins


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoneyExchangeLists(
    lista: List<Coins>,
    modifier: Modifier = Modifier
) {


    var isExp by rememberSaveable { mutableStateOf(false) }
    var isExp2 by rememberSaveable { mutableStateOf(false) }

    var selectedIndexA by rememberSaveable {
        mutableStateOf(0)
    }

    var selectedIndexB by rememberSaveable {
        mutableStateOf(0)
    }

    var cantidad by remember { mutableStateOf("25") }
    var resultado by remember { mutableStateOf("") }


    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {


        OutlinedTextField(
            value = cantidad,
            onValueChange = { input -> cantidad = input },
            modifier = modifier.align(Alignment.CenterHorizontally)
        )

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {


            DropdownList(
                lista,
                isExp,
                changeIsExpanded = { valor -> isExp = valor },
                selectedIndexA,
                onSelectedIndexChange = { valor -> selectedIndexA = valor },
                modifier = modifier.width(200.dp)
            )


            DropdownList(
                lista,
                isExp2,
                changeIsExpanded = { valor -> isExp2 = valor },
                selectedIndexB,
                onSelectedIndexChange = { valor -> selectedIndexB = valor },
                modifier = modifier.width(200.dp)
            )
        }

        Button(onClick = {
            resultado = Calcula(
                cantidad = cantidad.toFloat(),
                lista[selectedIndexA].value,
                lista[selectedIndexB].value
            )
        }) {
            Text(text = "Calcula")
        }

        Text("La conversion de $cantidad de " + lista[selectedIndexA].name + " a " + lista[selectedIndexB].name + " es de " + resultado)

    }

}


fun Calcula(cantidad: Float, origen: Float, destino: Float): String {

    var res = (cantidad * origen) / destino

    return res.toString()

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropdownList(
    lista: List<Coins>,
    isExpanded: Boolean,
    changeIsExpanded: (Boolean) -> Unit,
    selectedIndex: Int,
    onSelectedIndexChange: (Int) -> Unit,
    modifier: Modifier = Modifier
) {


    ExposedDropdownMenuBox(
        expanded = isExpanded,
        onExpandedChange = { changeIsExpanded(!isExpanded) }) {
        TextField(
            modifier = modifier.menuAnchor(),
            value = lista[selectedIndex].name,
            onValueChange = {},
            readOnly = true,
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded) }

        )

        ExposedDropdownMenu(expanded = isExpanded, onDismissRequest = { changeIsExpanded(false) }) {
            lista.forEachIndexed { index, item ->
                DropdownMenuItem(
                    text = { Text(item.name) },
                    onClick = {
                        onSelectedIndexChange(index)
                        changeIsExpanded(false)
                    },

                    contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                )
            }
        }
    }

}


@Composable
@Preview(showBackground = true)
fun MoneyExchangeListsPreview() {
    MoneyExchangeLists(emptyList())
}