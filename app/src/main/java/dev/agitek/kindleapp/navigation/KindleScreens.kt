package dev.agitek.kindleapp.navigation

import dev.agitek.kindleapp.screens.login.LoginScreen

enum class KindleScreens {
    BookScreen,
    HomeScreen,
    SplashScreen,
    LoginScreen;
    companion object {
        fun fromRoute(route: String?) : KindleScreens = when(route?.substringBefore("/")) {
            BookScreen.name -> BookScreen
            HomeScreen.name -> HomeScreen
            LoginScreen.name -> LoginScreen
            SplashScreen.name -> SplashScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
    }
}