package com.example.instagramapp.signin.components

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramapp.R

@Composable
fun SignInHeader(modifier: Modifier = Modifier) {

    Column(
        modifier
            .fillMaxWidth()
            .background(colorResource(id = R.color.green))
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Lorem Ipsum Dolor", color = Color.White)
        Spacer(Modifier.size (20.dp))
        Text("SIGN IN", fontSize = 32.sp, color = Color.White)
    }

}




@Composable
@Preview(showBackground = true)
fun SignInHeaderPreview() {

    SignInHeader()
}