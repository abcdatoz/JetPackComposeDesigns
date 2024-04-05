package com.example.instagramapp.profile

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramapp.profile.components.ProfileAction
import com.example.instagramapp.profile.components.ProfileDescription
import com.example.instagramapp.profile.components.ProfileHeader
import com.example.instagramapp.profile.components.ProfileInformation
import com.example.instagramapp.profile.components.ProfilePost
import com.example.instagramapp.profile.components.ProfilePostImage
import com.example.instagramapp.profile.components.ProfileStoryHighlight


@Composable
fun ProfileScreen() {

    val user = User(
        username = "martin keepa",
        profileImageUrl = "https://via.placeholder.com/200",
        followers = 360,
        followings = 100,
        name = "martin k",
        description = "algo en desarrollo",
        stories = listOf(
            Story("https://via.placeholder.com/200", "Story 1"),
            Story("https://via.placeholder.com/200", "Story 2"),
            Story("https://via.placeholder.com/200", "Story 3"),
            Story("https://via.placeholder.com/200", "Story 4"),
            Story("https://via.placeholder.com/200", "Story 5"),
            Story("https://via.placeholder.com/200", "Story 6"),
            Story("https://via.placeholder.com/200", "Story 7"),
            Story("https://via.placeholder.com/200", "Story 8"),
            Story("https://via.placeholder.com/200", "Story 9"),
            Story("https://via.placeholder.com/200", "Story 10")
        ),
        posts = listOf(
            "https://via.placeholder.com/500",
            "https://via.placeholder.com/500",
            "https://via.placeholder.com/500",
            "https://via.placeholder.com/500",
            "https://via.placeholder.com/500",
            "https://via.placeholder.com/500",
            "https://via.placeholder.com/500",
            "https://via.placeholder.com/500",
            "https://via.placeholder.com/500",
            "https://via.placeholder.com/500",
            "https://via.placeholder.com/500",
            "https://via.placeholder.com/500",
            "https://via.placeholder.com/500",
            "https://via.placeholder.com/500","https://via.placeholder.com/500",
            "https://via.placeholder.com/500"
        ),

        )

    Column {


        val size = 3
        val context = LocalContext.current
        Column {

            ProfileHeader(
                backClick = { showToast(context, "Back Button") },
                notificationClick = { showToast(context, "Notification Button") },
                optionClick = { showToast(context, "option Button") },
                username = user.username
            )

            LazyVerticalGrid(columns = GridCells.Fixed(3)) {

                item(span = { GridItemSpan(size) }) {
                    ProfileInformation(
                        imageUrl = user.profileImageUrl,
                        posts = user.posts.count(),
                        followers = user.followers,
                        followings = user.followings
                    )
                }


                item(span = { GridItemSpan(size) }) {
                    ProfileDescription(
                        name = user.name,
                        descripcion = user.description,
                        Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 4.dp)
                    )
                }

                item(span = { GridItemSpan(size) }) {
                    ProfileAction(
                        followClick = { showToast(context, "follow Button") },
                        messageClick = { showToast(context, "message Button") },
                        Modifier.padding(start = 16.dp, end = 16.dp)
                    )
                }

                item(span = { GridItemSpan(size) }) {
                    ProfileStoryHighlight(
                        onClick = { showToast(context, "highlight") },
                        user.stories,
                        Modifier.padding(start = 16.dp, end = 16.dp)
                    )
                }

                items(user.posts) {
                    ProfilePostImage(
                        it,
                        onClick = { showToast(context, "post") },
                        modifier = Modifier.padding(1.dp)
                    )
                }

            }

        }


    }

}

private fun showToast(context: Context, clickedItem: String) {
    Toast.makeText(context, "Clicked on: $clickedItem", Toast.LENGTH_SHORT).show()
}


@Preview(showBackground = true)
@Composable
fun profileScreenPreview() {
    ProfileScreen()
}
