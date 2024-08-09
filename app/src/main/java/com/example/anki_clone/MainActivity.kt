package com.example.anki_clone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.anki_clone.sets.Starter_set


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            //creating a navcontroller to switch between activities
            val navcon = rememberNavController()
            NavHost(navController = navcon, startDestination = "screen_1", builder = {
                composable("screen_1"){
                    Starter_set(navcon)
                }
                composable("screen_2"){
                    MainActivity()
                }

            } )

        }
        }
    }


