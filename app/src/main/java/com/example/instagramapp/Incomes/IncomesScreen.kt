package com.example.instagramapp.Incomes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramapp.Incomes.components.IncomesAmount
import com.example.instagramapp.Incomes.components.IncomesOutcomes
import com.example.instagramapp.Incomes.components.IncomesPeriodSelect
import com.example.instagramapp.header.HeaderScreen
import com.example.instagramapp.submenu.SubMenu


@Composable
fun IncomesScreen (){

    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Column {
            HeaderScreen()
            IncomesAmount()
            IncomesPeriodSelect()
            IncomesOutcomes(Modifier.padding(horizontal = 10.dp))
        }


        SubMenu()
    }

}


@Composable
@Preview(showBackground = true)
fun IncomesScreenPreview(){

    IncomesScreen()

}