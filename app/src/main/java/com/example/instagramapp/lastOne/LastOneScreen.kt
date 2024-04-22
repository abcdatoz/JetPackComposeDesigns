package com.example.instagramapp.lastOne

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramapp.lastOne.components.Resultados
import com.example.instagramapp.lastOne.components.Search
import com.example.instagramapp.submenu.SubMenu

@Composable
fun LastOneScreen(){

    Column (Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        
        Column(Modifier.fillMaxWidth().padding(horizontal = 15.dp)){
            Search()
            Spacer(Modifier.size(20.dp))
            Resultados()
        }


        SubMenu()
    }
}


@Composable
@Preview(showBackground = true)
fun LastOneScreenPreview(){
    LastOneScreen()
}