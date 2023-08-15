package com.example.benchat.ui.navigations.bottonNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.benchat.ui.navigations.authNavigation.loginGraph
import com.example.benchat.ui.screens.ProfileScreen


@Composable
fun BottomNavGraph(
    navController: NavHostController
) {


    NavHost(navController = navController, startDestination = BottomNavScreen.Home.route){

        // How switch between login graph and navigation graph depending on isLoggedIn?
        loginGraph(navController = navController)

        composable(BottomNavScreen.Home.route){
            HomeScreen()
        }
        composable(BottomNavScreen.Accounts.route){
            AccountsScreen()
        }
        composable(BottomNavScreen.Message.route){
            MessageScreen()
        }
        composable(BottomNavScreen.Profile.route){
            ProfileScreen()
        }
        composable(BottomNavScreen.Settings.route){
            SettingsScreen()
        }
    }

}