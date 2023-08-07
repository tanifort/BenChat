package com.example.benchat.ui.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.benchat.ui.screens.LoginScreen

@Composable
fun AuthNavGraph(navController: NavHostController) {
    // The startDestination should depend on the fact that, if the user is registered then the start will login else show splash
    val isRegistered = false;
    val initialRoute: String = if(isRegistered) AuthNavItem.Login.route else AuthNavItem.Splash.route;
   NavHost(navController = navController, startDestination = initialRoute){
       composable(AuthNavItem.Splash.route){
           SplashScreen(navController)
       }
       composable(AuthNavItem.Login.route){
           LoginScreen(navController)
       }
   }

}