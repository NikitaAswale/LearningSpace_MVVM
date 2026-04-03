package com.example.learningspace_mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learningspace_mvvm.ui.theme.LearningSpace_MVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningSpace_MVVMTheme {
               //NavComponent()
                ProfileDetailsUI()
            }
        }
    }
}

//@Composable
//fun NavComponent() {
//
//    val navController = rememberNavController() // to define the state of the navigation
//
//    NavHost(navController = navController, startDestination = "Screen1")
//    {
//        composable("Screen1") {
//            LearningSpace_UI(navController = navController)
//        }
//
//        composable("Screen2") {
//            MemberGallery_UI(navController = navController)
//        }
//    }
//}
