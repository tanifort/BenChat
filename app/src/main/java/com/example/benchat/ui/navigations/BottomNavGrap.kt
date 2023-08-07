package com.example.benchat.ui.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.benchat.ui.screens.ProfileScreen


@Composable
fun BottomNavGraph(
    navController: NavHostController
) {

    NavHost(navController = navController, startDestination = BottomNavItem.Home.route){
        composable(BottomNavItem.Home.route){
            HomeScreen()
        }
        composable(BottomNavItem.Accounts.route){
            AccountsScreen()
        }
        composable(BottomNavItem.Message.route){
            MessageScreen()
        }
        composable(BottomNavItem.Profile.route){
            ProfileScreen()
        }
        composable(BottomNavItem.Settings.route){
            SettingsScreen()
        }
    }

}