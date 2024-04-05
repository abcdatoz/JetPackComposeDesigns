package com.example.instagramapp.coinExchange.components

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
import com.example.instagramapp.R
import com.example.instagramapp.tools.toMoney

@Composable
fun CoinExchangeBalance(
    saldo: Double,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.green_soft))
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Lorem")
        Text(text = toMoney(saldo).toString())
    }
}

@Composable
@Preview(showBackground = true)
fun CoinExchangeBalancePreview() {
    CoinExchangeBalance(123456.0)
}
