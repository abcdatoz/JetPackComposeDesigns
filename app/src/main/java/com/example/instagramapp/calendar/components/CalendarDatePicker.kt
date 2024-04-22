package com.example.instagramapp.calendar.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CalendarDatePicker(modifier: Modifier = Modifier){


    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
        Text("234")
    }
}



@Composable
@Preview(showBackground = true)
fun CalendarDatePickerPreview(){
    CalendarDatePicker()
}