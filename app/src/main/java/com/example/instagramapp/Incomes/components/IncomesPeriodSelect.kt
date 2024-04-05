package com.example.instagramapp.Incomes.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun IncomesPeriodSelect(modifier: Modifier = Modifier) {
    val periodos = listOf("Yesterday", "Today", "Week", "Month", "Quarter", "Semester", "Year")

    val tabItems = listOf(
        TabItem("Home", Icons.Outlined.Home, Icons.Filled.Home),
        TabItem("Browse", Icons.Outlined.ShoppingCart, Icons.Filled.ShoppingCart),
        TabItem("Account", Icons.Outlined.Person, Icons.Filled.Person),
    )


    var selectedTabIndex by remember {
        mutableIntStateOf(0)
    }

    val pagerState = rememberPagerState {
        tabItems.size
    }

    LaunchedEffect(selectedTabIndex) {
        pagerState.animateScrollToPage(selectedTabIndex)
    }

    LaunchedEffect(pagerState.currentPage, pagerState.isScrollInProgress) {

        if (!pagerState.isScrollInProgress) {
            selectedTabIndex = pagerState.currentPage
        }
    }


    TabRow(selectedTabIndex = selectedTabIndex) {

        tabItems.forEachIndexed { index, item ->
            Tab(
                selected = index == selectedTabIndex,
                onClick = {
                    selectedTabIndex = index
                },
                text = {
                    Text(text = "item.title")
                },
                icon = {
                    Icon(
                        imageVector = if (index == selectedTabIndex) {
                            item.selectedIcon
                        } else {
                            item.unselectedIcon
                        },
                        contentDescription = item.title
                    )
                }
            )
        }
    }

    HorizontalPager(
        state = pagerState, modifier = Modifier
            .fillMaxWidth()
    ) { index ->
        Box(modifier = modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
//            Text(tabItems[index].title)
            Text("")
        }
    }
}


@Composable
@Preview(showBackground = true)
fun IncomesPeriodSelectPreview() {
    IncomesPeriodSelect()
}


data class TabItem(
    val title: String,
    val unselectedIcon: ImageVector,
    val selectedIcon: ImageVector
)