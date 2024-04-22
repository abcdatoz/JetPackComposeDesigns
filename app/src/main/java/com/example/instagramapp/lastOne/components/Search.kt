package com.example.instagramapp.lastOne.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Search(modifier:Modifier = Modifier){

    Row (modifier = modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
        Icon(imageVector = Icons.Default.Search, contentDescription = "")
        Text("Search")
    }
}

@Composable
@Preview(showBackground = true)
fun SearchPreview()
{
    Search()
}