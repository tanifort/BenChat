package com.example.benchat.ui.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.benchat.ui.navigations.authNavigation.loginGraph
import com.example.benchat.ui.navigations.bottonNavigation.BottomNavScreen
import com.example.benchat.ui.navigations.bottonNavigation.bottomNavigationGraph

@Composable
fun AppNavigation(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomNavScreen.Home.route){
       if("" == "belmo" ){
           loginGraph(navController)
       }else{
           bottomNavigationGraph(navController)
       }
    }
}