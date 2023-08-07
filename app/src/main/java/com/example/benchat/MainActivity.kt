package com.example.benchat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.benchat.domain.viewModels.AuthViewModel
import com.example.benchat.ui.navigations.HomeScreen
import com.example.benchat.ui.screens.MainScreen
import com.example.benchat.ui.theme.BenChatTheme
import com.parse.Parse
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContent {
            BenChatTheme {
                val authViewModel: AuthViewModel by viewModels()
                authViewModel.afterLogin()
                // A surface container using the 'background' color from the theme
                MainScreen(authViewModel)

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BenChatTheme {
        HomeScreen()
    }
}