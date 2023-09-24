package com.example.composeapplication.whatsapp_clone.widgets

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun StatusTitle(title:String?){
    Text(text = title?:"", color = Color.Black)
}