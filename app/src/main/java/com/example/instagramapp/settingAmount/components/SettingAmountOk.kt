package com.example.instagramapp.settingAmount.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SettingAmountOk(modifier: Modifier = Modifier ){
    
    Row (modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            
            Text(text = "Lorem Ipsum", color = Color.White)
        }
    }
}


@Composable
@Preview(showBackground = true)
fun SettingAmountOkPreview(){
    SettingAmountOk()
}