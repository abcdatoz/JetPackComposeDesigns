package com.example.instagramapp.profile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun ProfileInformation (
    imageUrl: String,
    posts: Int,
    followers: Int,
    followings: Int,
    modifier: Modifier = Modifier
){
    Row(modifier.fillMaxWidth() , verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween){
        AsyncImage(
            model = imageUrl,
            contentDescription = "profile image",
            modifier = Modifier.clip(CircleShape)

        )

        ProfileInformationItem(posts,"Publicaciones")
        ProfileInformationItem(followers,"Followeing")
        ProfileInformationItem(followings,"Followers")
    }

}


@Composable
private fun ProfileInformationItem(
    amount: Int,
    type: String,
    modifier: Modifier = Modifier
){
    Column (modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally ){
        Text(amount.toString(), fontWeight = FontWeight.Bold)
        Text(type)
    }

}

@Preview(showBackground = true)
@Composable
fun ProfileInformationPreview(){
    ProfileInformation("",0,0,0)
}