package com.example.instagramapp.menu.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MenuActions(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(10.dp),
            modifier = modifier.fillMaxWidth()
        ) {
            Text("Lorem Ipsum", color = Color.White)
        }

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            shape = RoundedCornerShape(10.dp),
            modifier = modifier.fillMaxWidth()
        ){
            Text("Ipsum Lorem", color = Color.Black)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuActionsPreview() {
    MenuActions()
}