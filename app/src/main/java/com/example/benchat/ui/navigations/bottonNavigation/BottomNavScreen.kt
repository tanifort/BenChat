package com.example.benchat.ui.navigations.bottonNavigation

import com.example.benchat.R
import com.example.benchat.ui.helpers.Routes


sealed class BottomNavScreen(var title: String, var icon: Int, var route: String){

    object Home: BottomNavScreen("Home",R.drawable.outline_home_24, Routes.Home)
    object Profile: BottomNavScreen("Profile",R.drawable.outline_account_circle_24, Routes.Profile)
    object Settings: BottomNavScreen("Settings",R.drawable.outline_settings_24, Routes.Settings)
    object Message: BottomNavScreen("Messages",R.drawable.baseline_home_24, Routes.Messages)
    object Accounts: BottomNavScreen("Accounts",R.drawable.outline_people_24, Routes.Messages)
}
