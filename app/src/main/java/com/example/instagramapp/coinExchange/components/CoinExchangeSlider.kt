package com.example.instagramapp.coinExchange.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramapp.data.Coins

@Composable
fun CoinExchangeSlider(
    sliderPosition: MutableState<Float>,
    valorA: Float,
    valorB: Float,
    amount: MutableState<Float>,
    modifier: Modifier = Modifier
) {

    //onAmountChange: (Float) -> Unit,

    val green500 = Color(0xFF4CAF50)
    val green900 = Color(0xFF1B5E20)
    val lime500 = Color(0xFFCDDC39)

    Column(modifier = Modifier.padding(horizontal = 20.dp)) {
        Text("Lorem")
        Text(text = sliderPosition.value.toString(), fontSize = 15.sp, fontWeight = FontWeight.Bold)
        Slider(
            value = sliderPosition.value,
            onValueChange = {

                sliderPosition.value = it

                amount.value = ((valorA / valorB) * it)

            },
            valueRange = 0f..1000f,
            steps = 10,
            colors = SliderDefaults.colors(
                thumbColor = green900,
                activeTrackColor = green500,
                inactiveTrackColor = Color.LightGray.copy(alpha = 0.24f),
                activeTickColor = lime500,
                inactiveTickColor = lime500.copy(alpha = 0.56f)
            )
        )
    }
}


@Composable
@Preview(showBackground = true)
fun CoinExchangeSliderPreview() {
    CoinExchangeSlider(mutableStateOf(0f), 0f, 0f, mutableStateOf(0f))
}