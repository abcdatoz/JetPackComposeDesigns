package com.example.instagramapp.balance

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramapp.R
import com.example.instagramapp.tools.toMoney

@Composable
fun Balance(
    amount: Double,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.green_soft))
            .padding(vertical = 10.dp)
        ,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Text("Lorem Ipsum", fontSize = 15.sp)
        Text(toMoney(amount), fontSize = 20.sp)

    }
}

@Composable
@Preview
fun BalancePreview() {
    Balance(123.0)
}