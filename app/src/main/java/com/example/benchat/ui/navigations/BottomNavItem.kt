package com.example.benchat.ui.navigations

import com.example.benchat.R
import com.example.benchat.ui.helpers.Routes


sealed class BottomNavItem(var title: String, var icon: Int, var route: String){

    object Home: BottomNavItem("Home",R.drawable.outline_home_24, Routes.Home)
    object Profile: BottomNavItem("Profile",R.drawable.outline_account_circle_24, Routes.Profile)
    object Settings: BottomNavItem("Settings",R.drawable.outline_settings_24, Routes.Settings)
    object Message: BottomNavItem("Messages",R.drawable.baseline_home_24, Routes.Messages)
    object Accounts: BottomNavItem("Accounts",R.drawable.outline_people_24, Routes.Messages)
}
