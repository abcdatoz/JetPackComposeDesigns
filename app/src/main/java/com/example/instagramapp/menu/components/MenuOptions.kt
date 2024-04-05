package com.example.instagramapp.menu.components

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MenuOptions(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.fillMaxWidth()
    )
    {
        Item(Icons.Default.Email, "Messages", 5)

        Item(Icons.Default.Notifications, "Notifications", 3)

        Item(Icons.Default.AccountCircle, "AccountDetails", 0)

        Item(Icons.Default.ShoppingCart, "MyPurchases", 0)

        Item(Icons.Default.Settings, "Settings", 0)
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Item(
    ic: ImageVector,
    nombre: String,
    cantidad: Int,
    modifier: Modifier = Modifier
) {

    Column(modifier = modifier.fillMaxWidth()) {

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(end = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box() {

                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(ic, "item", tint = Color.Green)
                    }
                    Text(nombre)
                }


            }

            if (cantidad > 0) {
                Badge(
                    containerColor = Color.Green,
                    contentColor = Color.White
                )
                {
                    Text(text = cantidad.toString())
                }

            }else{
                Spacer(modifier = modifier.size(24.dp))
            }



        }

        Divider(color = Color.Gray, thickness = 1.dp)


    }
}

@Preview(showBackground = true)
@Composable
fun MenuOptionsPreview() {
    MenuOptions()
}