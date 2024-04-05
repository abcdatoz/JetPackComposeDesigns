package com.example.instagramapp.signin.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SignInRememberMe (
    modifier: Modifier = Modifier
){
    var checked by remember {
        mutableStateOf(true)
    }
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically

    ){
        Switch(
            checked = checked,
            colors = SwitchDefaults.colors(
//                checkedThumbColor = Color.Green,
                checkedTrackColor = Color.Green,
//                uncheckedThumbColor = Color.Green,
                uncheckedTrackColor = Color.Green
            ),
            onCheckedChange = { checked = it}
        )
        Spacer(Modifier.width(10.dp))
        Text("Remember me...")
    }
}


@Composable
@Preview(showBackground = true)
fun SignInRememberMePreview(){
    SignInRememberMe()
}