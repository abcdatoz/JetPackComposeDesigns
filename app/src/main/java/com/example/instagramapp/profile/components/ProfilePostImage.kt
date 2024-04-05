package com.example.instagramapp.profile.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage

@Composable
fun ProfilePostImage(
    imageUrl: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Box(modifier = modifier.clickable { onClick() }){
        AsyncImage(model = imageUrl, contentDescription = "user post")
    }
}