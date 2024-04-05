package com.example.instagramapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagramapp.Incomes.IncomesScreen
import com.example.instagramapp.chart.ChartScreen
import com.example.instagramapp.coinExchange.CoinExchangeScreen
import com.example.instagramapp.frutas.FrutasScreen
import com.example.instagramapp.frutas.ShareValueScreen
import com.example.instagramapp.menu.MenuScreen
import com.example.instagramapp.moneyExchange.MoneyExchangeScreen
import com.example.instagramapp.profile.ProfileScreen
import com.example.instagramapp.profile.components.ProfileInformation
import com.example.instagramapp.settingAmount.SettingAmountScreeenPreview
import com.example.instagramapp.signin.SignInScreen
import com.example.instagramapp.ui.theme.InstagramAppTheme
import com.example.instagramapp.verification.VerificationScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //ProfileScreen()
                    //SignInScreen()
                    //MenuScreen()
                    //VerificationScreen()
                    //IncomesScreen()
                    //SettingAmountScreeenPreview()
                    //MoneyExchangeScreen()
                    //CoinExchangeScreen()
                    //FrutasScreen()
                    //ShareValueScreen()
                    ChartScreen()
                }
            }
        }
    }
}
