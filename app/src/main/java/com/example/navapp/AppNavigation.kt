package com.example.navapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavig () {

    // Dans la plupart des cas la variable kerlino est souvent remplacee par "navController"
    val kerlino  = rememberNavController()

    NavHost(
        navController = kerlino,
        startDestination = "screen-a"
    ) {

        composable(
            "screen-a"
        ) {

            ScreenA (
                GotoSceenB = { kerlino.navigate("screen-b") }
            )
        }

        composable ("screen-b")
        {
            ScreenB (
                GotoSceenC = { kerlino.navigate("screen-c") },
                GobackToScreenA = { kerlino.popBackStack() } // retour en arriere
                )
        }

        composable ("screen-c")
        {
            ScreenC (
                GobackToScreenB = {kerlino.popBackStack()},
                GobackToScreenA = { kerlino.popBackStack()
                    kerlino.popBackStack()
                /*
                 kerlino.navigate("screnn-a") {
                popUpTo(0)
// Ca fera en sorte que lorsque vous appuyez pour revenir sur l'ecran A,
 vous allez directement sortir de l'App
                }
                 */
        }
            )
        }


    }


}