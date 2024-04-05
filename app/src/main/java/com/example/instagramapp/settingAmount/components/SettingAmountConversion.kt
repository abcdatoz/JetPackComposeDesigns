package com.example.instagramapp.settingAmount.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SettingAmountConversion(modifier: Modifier = Modifier){

    Row (modifier = modifier.fillMaxWidth()) {
        Text(text = "$1 USD = MXN$16.64 ")
    }
}


@Composable
@Preview(showBackground = true)
fun SettingAmountConversionPreview(){
    SettingAmountConversion()
}