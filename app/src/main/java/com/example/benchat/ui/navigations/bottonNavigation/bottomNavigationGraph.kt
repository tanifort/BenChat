package com.example.benchat.ui.navigations.bottonNavigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.benchat.ui.screens.ProfileScreen


fun NavGraphBuilder.bottomNavigationGraph(navController: NavController){
    navigation(startDestination = BottomNavScreen.Home.route, route = BottomNavScreen.Home.route){
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