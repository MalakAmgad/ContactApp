package com.bankmisr.contactapp

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
import com.bankmisr.contactapp.ui.theme.ContactAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContactAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
                    UI()
                }
            }
        }
    }
}

@Composable
fun APP( modifier: Modifier = Modifier) {
    UI()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ContactAppTheme {
        APP()
    }
}