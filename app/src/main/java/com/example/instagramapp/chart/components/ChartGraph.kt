package com.example.instagramapp.chart.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramapp.R
import com.example.instagramapp.tools.toMoney

@Composable
fun ChartGraph(modifier: Modifier = Modifier) {

    val months = listOf("Apr", "May", "Jun", "Jul", "Augst", "Sept", "Oct", "Nov", "Dec")

    val imagePainter = painterResource(id = R.drawable.chart)

    Column(modifier.fillMaxWidth(),

        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            Text(toMoney(987.0))
        }


        Spacer(modifier = modifier.size(10.dp))


        Image(painter = imagePainter,
            contentDescription = "chart",
            contentScale = ContentScale.Fit,
            modifier = modifier.size(300.dp, 250.dp)
        )

        Spacer(modifier = modifier.size(10.dp))

        LazyRow(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            items(months) { month ->
                Text(month)
            }

        }
    }
}

@Composable
@Preview(showBackground = true)
fun ChartGraphPreview() {
    ChartGraph()
}
