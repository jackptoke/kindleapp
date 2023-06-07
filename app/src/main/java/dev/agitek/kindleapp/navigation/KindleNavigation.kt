package dev.agitek.kindleapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.agitek.kindleapp.screens.homescreen.HomeScreen
import dev.agitek.kindleapp.screens.login.LoginScreen
import dev.agitek.kindleapp.screens.splash.SplashScreen

@Composable
fun KindleNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = KindleScreens.SplashScreen.name) {
      composable(KindleScreens.SplashScreen.name) {
          SplashScreen()
      }

        composable(KindleScreens.HomeScreen.name) {
            HomeScreen()
        }

        composable(KindleScreens.LoginScreen.name) {
            LoginScreen()
        }
    }
}