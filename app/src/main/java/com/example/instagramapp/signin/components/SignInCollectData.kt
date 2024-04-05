package com.example.instagramapp.signin.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInCollectData(
    modifier: Modifier = Modifier
){
    var nombre by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally

    ){



        SignInCollectDataInput("username",nombre,"nombre de usuario")

        Spacer( modifier.size(20.dp))


        SignInCollectDataInput("Password",pass,"Introduzca su pass")




    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SignInCollectDataInput(
    fieldName: String,
    nombre: TextFieldValue,
    placeholder: String,
    modifier: Modifier = Modifier){

    Box(modifier = modifier){
        Column {
            Text(fieldName)

            OutlinedTextField(
                value = nombre,
                onValueChange = {},
                label = { Text(placeholder) }
            )
        }

    }


}

@Composable
@Preview(showBackground = true)
fun SignInCollectDataPreview (){
    SignInCollectData()
}