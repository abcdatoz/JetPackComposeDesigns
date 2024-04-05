package com.example.instagramapp.verification

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VerificationCode(modifier: Modifier = Modifier) {
    var codeA by remember { mutableStateOf("") }
    var codeB by remember { mutableStateOf("") }
    var codeC by remember { mutableStateOf("") }
    var codeD by remember { mutableStateOf("") }


    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        )
        {
            VerificationCodeCode("3")
            VerificationCodeCode("7")
            VerificationCodeCode("")
            VerificationCodeCode("")

        }

        Spacer(modifier = Modifier.size(30.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            shape = RoundedCornerShape(10.dp),
        ) {
            Text("Lorem Ipsum")
        }




    }
}

@Composable fun VerificationCodeCode (
    texto : String,
    modifier: Modifier = Modifier
){
    Box(
        modifier = Modifier
            .background(Color.White)
            .width(70.dp)
            .height(70.dp)
            .border(1.dp, Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = texto,
            color = Color.Blue,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun VerificationCodePreview() {
    VerificationCode()
}