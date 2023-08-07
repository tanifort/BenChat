package com.example.benchat.ui.navigations

import com.example.benchat.ui.helpers.Routes

sealed class AuthNavItem(var title: String, var route: String) {

    object Splash: AuthNavItem("Splash", Routes.Splash )
    object Login: AuthNavItem("Login", Routes.Login )
}