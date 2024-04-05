package com.example.instagramapp.settingAmount


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramapp.header.HeaderScreen
import com.example.instagramapp.settingAmount.components.SettingAmountBalance
import com.example.instagramapp.settingAmount.components.SettingAmountCoinType
import com.example.instagramapp.settingAmount.components.SettingAmountConversion
import com.example.instagramapp.settingAmount.components.SettingAmountOk
import com.example.instagramapp.settingAmount.components.SettingAmountSlider
import com.example.instagramapp.submenu.SubMenu

@Composable
fun SettingAmountScreen(){

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween){

        Column {
            HeaderScreen()
            SettingAmountBalance()
            SettingAmountCoinType(Modifier.padding(vertical = 16.dp))
            SettingAmountConversion(Modifier.padding(start = 16.dp))
            SettingAmountSlider(Modifier.padding(16.dp))
            SettingAmountOk(Modifier.padding(top = 20.dp))
        }

        SubMenu()

    }
}

@Composable
@Preview(showBackground = true)
fun SettingAmountScreeenPreview(){
    SettingAmountScreen()
}