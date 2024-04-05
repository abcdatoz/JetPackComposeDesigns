package com.example.instagramapp.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun ProfileDescription(
    name: String,
    descripcion: String,
    modifier: Modifier =Modifier
){
    Column(
        modifier.fillMaxWidth()
    ){
        Text(name, fontWeight = FontWeight.Bold)
        Text(descripcion)
    }
}


@Preview(showBackground = true)
@Composable
fun ProfileDescriptionPreview(){
    ProfileDescription("","")
}
