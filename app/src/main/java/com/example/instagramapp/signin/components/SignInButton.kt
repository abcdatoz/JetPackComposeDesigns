package com.example.instagramapp.signin.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SignInButton(modifier : Modifier = Modifier){

    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
        Button(
            onClick = {}
        ){
            Text("Sign In")
        }

        Text("Lorem Ipsum..??")


    }
}

@Preview(showBackground = true)
@Composable
fun SignInButtonPreview(){
    SignInButton()
}