package com.example.instagramapp.settingAmount.components

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties

@Composable
fun SettingAmountCoinType(
    modifier: Modifier = Modifier
) {

    val monedas = listOf(
        "USD",
        "MXN",
        "EUR",
    )
    val cripto = listOf("BIT", "UHA", "SFC", "KJL")


    var selectedIndex by rememberSaveable {
        mutableStateOf(0)
    }


    var selectedCriptoIndex by rememberSaveable {
        mutableStateOf(0)
    }


    var buttonModifier = Modifier.width(150.dp)


    val expandedState = remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf("Select option") }

    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {

        DropdownList(
            lista = monedas,
            selectedIndex = selectedIndex,
            modifier = buttonModifier,
            onItemClick = { selectedIndex = it })

        DropdownList(
            lista = monedas,
            selectedIndex = selectedCriptoIndex,
            modifier = buttonModifier,
            onItemClick = { selectedCriptoIndex = it })


    }


}

@Composable
fun DropdownList(
    lista: List<String>,
    selectedIndex: Int,
    modifier: Modifier,
    onItemClick: (Int) -> Unit
) {

    var showDropdown by rememberSaveable { mutableStateOf(false) }
    val scroollState = rememberScrollState()

    Column(
        modifier = Modifier
            .border(width = 1.dp, color = Color.Black)
            .height(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {

        //button
        Box(
            modifier = modifier
                .background(Color.White)
                .clickable { showDropdown = true },
            contentAlignment = Alignment.Center
        ) {
            Text(lista[selectedIndex], modifier = Modifier.padding(3.dp))
        }

        //dropdown list
        Box() {
            if (showDropdown) {
                Popup(alignment = Alignment.TopCenter,
                    properties = PopupProperties(excludeFromSystemGesture = true),
                    onDismissRequest = { showDropdown = false }
                )
                {
                    Column(
                        modifier = modifier
                            .heightIn(max = 90.dp)
                            .verticalScroll(state = scroollState)
                            .border(width = 1.dp, color = Color.Gray),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        lista.onEachIndexed() { index, item ->

                            if (index != 0) {
                                Divider(thickness = 1.dp, color = Color.LightGray)
                            }
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .clickable {
                                        onItemClick(index)
                                        showDropdown = !showDropdown
                                    },
                                contentAlignment = Alignment.Center
                            ) {
                                Text(item)
                            }

                        }
                    }
                }
            }
        }


    }

}


@Composable
@Preview(showBackground = true)
fun SettingAmountCoinTypePreview() {
    SettingAmountCoinType()
}