package com.example.composeapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CounterApp() {
    val count= remember {
        mutableStateOf(value = 0)
    };
    Scaffold(
        drawerContent = {
            Column() {
                Text(text = "One")
            }
        },
        topBar = { TopAppBar(title = { Text(text = "Counter App") }) },
        floatingActionButton ={ FloatingActionButton(onClick = { count.value++ }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "ADD") }
        },
        
        content = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()
            ) {
                Text(text = "You have press the button this many times")
                Text(text = "${count.value}", style = MaterialTheme.typography.h6)
            }

        }
    )
}