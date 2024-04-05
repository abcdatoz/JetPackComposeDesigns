package com.example.instagramapp.coinExchange.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramapp.data.Coins
import com.example.instagramapp.tools.toMoney

@Composable
fun CoinExchangeConversor(
    lista: List<Coins>,
    selectedIndexA: MutableState<Int>,
    selectedIndexB: MutableState<Int>,
    cantidad: Float,
    amount: MutableState<Float>,
    modifier: Modifier = Modifier
) {


    var isExpandedA = remember { mutableStateOf(false) }
    var isExpandedB = remember { mutableStateOf(false) }


    Column(modifier.fillMaxWidth()) {

        Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {

            Combo(
                lista,
                isExpandedA,
                selectedIndexA,
                selectedIndexA,
                selectedIndexB,
                cantidad,
                amount,
                modifier = modifier.width(150.dp)
            )

            Combo(
                lista,
                isExpandedB,
                selectedIndexB,
                selectedIndexA,
                selectedIndexB,
                cantidad,
                amount,
                modifier = modifier.width(150.dp)
            )

        }

        Text("$1 " + lista[selectedIndexA.value].name + " = "
                        + toMoney ((lista[selectedIndexA.value].value / lista[selectedIndexB.value].value).toDouble())
                + " " + lista[selectedIndexB.value].name)


    }
}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Combo(
    lista: List<Coins>,
    isExpanded: MutableState<Boolean>,
    selectedIndex: MutableState<Int>,
    selectedIndexA: MutableState<Int>,
    selectedIndexB: MutableState<Int>,
    cantidad: Float,
    amount: MutableState<Float>,
    modifier: Modifier = Modifier
) {

    ExposedDropdownMenuBox(
        expanded = isExpanded.value,
        onExpandedChange = { isExpanded.value = !isExpanded.value }) {

        TextField(
            value = lista[selectedIndex.value].name,
            onValueChange = {},
            modifier = modifier.menuAnchor(),
            readOnly = true,
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded.value) }
        )


        ExposedDropdownMenu(
            expanded = isExpanded.value,
            onDismissRequest = { isExpanded.value = false }) {

            lista.forEachIndexed { ndx, item ->

                DropdownMenuItem(
                    text = { Text(item.name) },
                    onClick = {
                        selectedIndex.value = ndx
                        isExpanded.value = false


                        amount.value =  (lista[selectedIndexA.value].value / lista[selectedIndexB.value].value) * cantidad


                    },

                    contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding

                )


            }
        }

    }
}

@Composable
@Preview(showBackground = true)
fun CoinExchangeConversorPreview() {
    CoinExchangeConversor(
        emptyList(),
        mutableStateOf(0),
        mutableStateOf(0),
        0f,
        mutableStateOf(0f)
    )
}

