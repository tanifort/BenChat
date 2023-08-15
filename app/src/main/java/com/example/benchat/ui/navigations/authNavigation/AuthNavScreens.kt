package com.example.benchat.ui.navigations.authNavigation

import com.example.benchat.ui.helpers.Routes

sealed class AuthNavScreens(var title: String, var route: String) {

    object Splash: AuthNavScreens("Splash", Routes.Splash )
    object Login: AuthNavScreens("Login", Routes.Login )
}