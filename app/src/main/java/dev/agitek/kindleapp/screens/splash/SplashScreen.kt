package dev.agitek.kindleapp.screens.splash

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SplashScreen(navController: NavController) {
    Surface(modifier = Modifier.padding(15.dp).size(330.dp)) {
    Column(modifier= Modifier.padding(8.dp)) {
        Text(text = "We will drain the swamp")
        Text(text = "Stay inside!")
        }
    }
}