package com.example.benchat.ui.screens

import android.annotation.SuppressLint
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.benchat.ui.navigations.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {

    val navController = rememberNavController()
    //If user is loggedIn the home else

    Text(text = "Welcome")

}

@Preview
@Composable
fun PreviewMainScreen() {
}