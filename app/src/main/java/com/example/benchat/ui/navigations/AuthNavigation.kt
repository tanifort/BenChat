package com.example.benchat.ui.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun AuthNavigation(navController: NavHostController) {
    AuthNavGraph(navController = navController)
}