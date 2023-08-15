package com.example.benchat.ui.navigations.authNavigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.benchat.ui.navigations.bottonNavigation.SplashScreen
import com.example.benchat.ui.screens.LoginScreen


fun NavGraphBuilder.loginGraph(navController: NavController) {
    navigation(startDestination = AuthNavScreens.Splash.route, route = AuthNavScreens.Splash.route){
        composable(AuthNavScreens.Splash.route){
            SplashScreen(navController)
        }
        composable(AuthNavScreens.Login.route){
            LoginScreen(navController)
        }
    }
}