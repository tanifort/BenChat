package com.example.benchat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.benchat.ui.navigations.HomeScreen
import com.example.benchat.ui.theme.BenChatTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContent {
            BenChatTheme {
                // A surface container using the 'background' color from the theme

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