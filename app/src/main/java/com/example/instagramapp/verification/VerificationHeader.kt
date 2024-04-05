package com.example.instagramapp.verification

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramapp.R


@Composable
fun VerificationHeader(modifier: Modifier = Modifier){

    Column (
        modifier
            .fillMaxWidth()
            .background( colorResource(id = R.color.green)),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Spacer(modifier.size(20.dp))
        Text("Verification", color = Color.White, fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier.size(20.dp))
    }
}


@Preview(showBackground = true)
@Composable
fun VeirificationHeaderPreview(){
    VerificationHeader()
}