package com.example.composeapp.linkdin_clone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(name = "linkdinhome", showSystemUi = true)
@Composable
fun linkdinHome(){
    HomeLinkdin()
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeLinkdin(){
    Scaffold(topBar = { appTopbar() }){ paddingValues ->
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun appTopbar(){
    TopAppBar(
        title = { TextField(value = "", onValueChange ={},
            leadingIcon = { Icon(imageVector = Icons.Filled.Search, contentDescription = "")},
            placeholder = { Text(text = "Search")}
        ) },

        colors = TopAppBarDefaults.largeTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        actions = {
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Localized description"
                )
            }
        },


        navigationIcon = {
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "Localized description"
                )
            }
        },

        )
}
