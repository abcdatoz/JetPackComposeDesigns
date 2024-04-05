package com.example.instagramapp.submenu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview


sealed class IncomesBottomNavItem(
    var title: String,
    var icon: ImageVector
) {
    object Add: IncomesBottomNavItem("Add", Icons.Default.Add)
    object Home: IncomesBottomNavItem("Home", Icons.Default.Home)
    object Wallet: IncomesBottomNavItem("Wallet", Icons.Default.Email)
    object Place: IncomesBottomNavItem("Place", Icons.Default.Place)
    object Settings: IncomesBottomNavItem("Settings", Icons.Default.Settings)


}

@Composable
fun SubMenu (
    modifier: Modifier = Modifier
){

    val items = listOf(
        IncomesBottomNavItem.Add,
        IncomesBottomNavItem.Home,
        IncomesBottomNavItem.Wallet,
        IncomesBottomNavItem.Place,
        IncomesBottomNavItem.Settings

    )


    Row (modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){

        items.forEach { item ->

            IconButton(onClick = { /*TODO*/ }) {
                Icon(item.icon,item.title)
            }

        }

    }
}




@Composable
@Preview
fun SubMenuPreview(){
    SubMenu()
}