package com.example.instagramapp.chart.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramapp.R
import com.example.instagramapp.tools.toMoney



@Composable
fun ChartSaldo(
    amount: Double,
    modifier: Modifier = Modifier
) {

    Row(
        modifier
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.green_soft))
            .padding(10.dp),

        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Lorem Ipsum", fontSize = 16.sp, fontWeight = FontWeight.Light)
        Text(toMoney(amount), fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
    }
}

@Composable
@Preview(showBackground = true)
fun ChartSaldoPreview() {
    ChartSaldo(321.0)
}