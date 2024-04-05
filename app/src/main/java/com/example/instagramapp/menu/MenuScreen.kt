package com.example.instagramapp.menu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramapp.header.HeaderScreen
import com.example.instagramapp.menu.components.MenuActions
import com.example.instagramapp.menu.components.MenuOptions

@Composable
fun MenuScreen(){
    Column(
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Column{
            HeaderScreen()
            MenuOptions()
        }

        MenuActions(Modifier.padding(start = 10.dp, end = 10.dp))
    }

}

@Preview(showBackground = true)
@Composable
fun MenuScreenPreview(){
    MenuScreen()
}