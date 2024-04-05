package com.example.instagramapp.chart.components


import android.os.Build
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramapp.data.Income
import com.example.instagramapp.tools.toMoney
import java.time.LocalDate


@Composable
fun ChartIncomes(modifier: Modifier = Modifier) {


    val lista = listOf(
        Income(123f, "April 1"),
        Income(456f, "March 28"),
        Income(987f, "June 19"),
        Income(123f, "April 1"),
        Income(456f, "March 28"),
        Income(987f, "June 19"),
        )


    Column(
        modifier.fillMaxWidth()
    ) {

        Text(text = "Lorem Ipsum")

        Spacer(modifier.size(10.dp))

        LazyColumn(modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {

            items(lista) { item ->

                MyCard(item)

            }

        }

    }


}

@Composable
fun MyCard(income: Income, modifier: Modifier = Modifier) {

    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ),
        modifier = modifier
            .size(300.dp, 100.dp)
            .padding(vertical = 10.dp)
    ) {

        Column(modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center) {

            Row(
                modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                Text("Lorem", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                Text(toMoney(income.amount.toDouble()) , color = Color.Green)
            }

            Spacer(modifier.size(20.dp))

            Row(
                modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween

            ) {

                Text("Ipsum", fontSize = 13.sp, fontWeight = FontWeight.Bold)

                Text(income.fecha, color = Color.Blue)

            }

        }

    }

}

@Composable
@Preview(showBackground = true)
fun ChartIncomesPreview() {
    ChartIncomes()
}