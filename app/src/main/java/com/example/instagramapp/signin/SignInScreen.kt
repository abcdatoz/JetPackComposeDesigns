package com.example.instagramapp.signin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramapp.signin.components.SignInButton
import com.example.instagramapp.signin.components.SignInCollectData
import com.example.instagramapp.signin.components.SignInHeader
import com.example.instagramapp.signin.components.SignInRememberMe


@Composable
fun SignInScreen(){
    Column {
        SignInHeader()
        Spacer(Modifier.size(100.dp))
        SignInCollectData()
        SignInRememberMe(Modifier.padding(start = 50.dp))
        Spacer(Modifier.size(50.dp))
        SignInButton()
    }
}



@Composable
@Preview(showBackground = true)
fun SignInScreenPreview(){
    SignInScreen()
}

