package com.example.benchat.ui.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController

import com.example.benchat.domain.viewModels.AuthViewModel
import com.example.benchat.ui.navigations.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(authViewModel: AuthViewModel) {

    val navController = rememberNavController()
    //If user is loggedIn the home else
    val authState by authViewModel.authState.collectAsState();
    if(authState.auth_token == null){
     println("auth_token not null");
        Log.i("MAIN_SCREEN", "AUTH_TOKEN IS NULL")

        AuthNavigation(
            navController = navController
        )

    }else{

        Scaffold(
            bottomBar = { AppBottomNavigation(navController = navController) },
            content = { HomeScreen() }
        )
    }




}

@Preview
@Composable
fun PreviewMainScreen() {
    //MainScreen(viewModel = AuthViewModel())
}