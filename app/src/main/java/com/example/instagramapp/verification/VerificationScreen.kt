package com.example.instagramapp.verification

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun VerificationScreen (){
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween){
        Column(){
            VerificationHeader()
            VerificationCode()
        }

        VerificationKeyboard()

    }
}

@Preview(showBackground = true)
@Composable
fun VerificationScreenPreview(){
    VerificationScreen()
}


@Composable
fun ColumnExample (){
    Column (Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Text("qwe")
        Text("asd")
        VerificationKeyboard()
    }
}