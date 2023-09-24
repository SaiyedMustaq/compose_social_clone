package com.example.composeapplication

import WhatsAppMain
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapplication.ui.theme.ComposeApplicationTheme
import com.example.composeapplication.whatsapp_clone.StatusScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApplicationTheme {
                MyApp()
            }
        }
    }
}

@Preview(name = "EntryPoint")
@Composable
fun MyApp() {
    Surface{
        WhatsAppMain()
    }
}


