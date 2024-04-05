package com.example.instagramapp.header

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.instagramapp.R

@Composable
fun HeaderScreen(modifier: Modifier = Modifier){
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(colorResource(id = R.color.green)),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {


        Box(modifier = modifier.padding(start = 10.dp)) {

            Row( modifier = modifier, verticalAlignment = Alignment.CenterVertically) {

                AsyncImage(
                    model = "https://via.placeholder.com/200",
                    contentDescription = "profile pic",
                    Modifier.clip(CircleShape)
                )



                Column(
                    modifier = modifier
                        .padding(start = 20.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Lorem Ipsum", fontSize = 16.sp, color= Color.White)
                    Text("ipsum lorem", fontSize = 10.sp, color= Color.White)
                }

            }

        }

        IconButton(onClick = {}) {
            Icon(Icons.Default.Close, "Close", tint = Color.White)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HeaderScreenPreview(){
    HeaderScreen()
}