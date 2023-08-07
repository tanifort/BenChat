package com.example.benchat.ui.navigations

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.benchat.R


@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.teal_200))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Home",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp

        )
    }

}

@Composable
fun SettingsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.purple_200))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Settings",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp

        )
    }
}

@Composable
fun MessageScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.white))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Messages",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp

        )
    }
}

@Composable
fun AccountsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.black))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Accounts",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp

        )
    }
}

@Composable
fun SplashScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.black))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Splash",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp

        )
    }
}
