package com.example.composeapplication.whatsapp_clone

import CallView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(name = "MainCallView", showSystemUi = true)
@Composable
fun CallScreen(){
    LazyColumn(Modifier.fillMaxSize()) {
        item {
            Text("Recent",modifier = Modifier
                .padding(20.dp,10.dp))
        }
        item {
            CallView()
        }
    }
}