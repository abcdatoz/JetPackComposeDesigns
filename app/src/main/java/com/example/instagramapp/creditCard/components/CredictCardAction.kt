package com.example.instagramapp.creditCard.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramapp.R

@Composable
fun CredictCardAction(modifier: Modifier = Modifier){
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "Lorem ipsum and vallar do haeris", modifier = modifier.padding(bottom = 30.dp))
        Box(modifier = modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color = colorResource(id = R.color.gold))) {
            Spacer(Modifier.size(10.dp))
        }

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(
                "Click em",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                modifier = modifier.width(200.dp)
            )
        }


    }
}


@Composable
@Preview(showBackground = true)
fun CredictCardActionPreview(){
    CredictCardAction()
}