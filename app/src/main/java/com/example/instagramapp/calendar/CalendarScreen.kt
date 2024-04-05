package com.example.instagramapp.calendar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramapp.R
import com.example.instagramapp.calendar.components.CalendarSaldo
import com.example.instagramapp.submenu.SubMenu

@Composable
fun CalendarScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            ,

        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Header")
        CalendarSaldo(amount = 198500.0)

        SubMenu()
    }
}


@Composable
@Preview(showBackground = true)
fun CalendarScreenPreview() {
    CalendarScreen()
}