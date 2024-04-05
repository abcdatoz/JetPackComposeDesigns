package com.example.instagramapp.settingAmount.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SettingAmountSlider(modifier: Modifier = Modifier) {

    var sliderPosition by remember { mutableFloatStateOf(0f) }
    val green500 = Color(0xFF4CAF50)
    val green900 = Color(0xFF1B5E20)
    val lime500 = Color(0xFFCDDC39)




    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 10.dp)
    ) {
        Text(text = "Lorem")

        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            colors = SliderDefaults.colors(
                thumbColor = green900,
                activeTrackColor = green500,
                inactiveTrackColor = Color.LightGray.copy(alpha = 0.24f),
                activeTickColor = lime500,
                inactiveTickColor = lime500.copy(alpha = 0.56f)
            )
        )

        Text(text = "Ipsum")

        Text(text = "$590.45", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)

    }
}


@Composable
@Preview(showBackground = true)
fun SettingAmountSliderPreview() {
    SettingAmountSlider()
}