package com.example.instagramapp.chart

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramapp.chart.components.ChartGraph
import com.example.instagramapp.chart.components.ChartIncomes
import com.example.instagramapp.chart.components.ChartSaldo
import com.example.instagramapp.header.HeaderScreen
import com.example.instagramapp.submenu.SubMenu

@Composable
fun ChartScreen(){

    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        HeaderScreen()

        Column(verticalArrangement = Arrangement.SpaceBetween){

            ChartSaldo(6987645.0)

            ChartGraph()

            ChartIncomes()
        }


        SubMenu()
    }



}

@Composable
@Preview(showBackground = true)
fun ChartScreenPreview(){

    ChartScreen()
}