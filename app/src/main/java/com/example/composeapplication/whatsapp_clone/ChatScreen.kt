package com.example.composeapplication.whatsapp_clone

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapplication.R
import com.example.composeapplication.whatsapp_clone.widgets.WhatsAppAppBar
import com.example.composeapplication.whatsapp_clone.widgets.WhatsAppTile
import userChatList

@Preview(name = "ChatScreen")
@Composable
fun ChatScreen(){
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                backgroundColor = colorResource(R.color.teal_Dark_Green),
                contentColor = colorResource(R.color.white),
                onClick = { }
            ) {
                Icon(Icons.Filled.Add, "Floating action button.")
            }
        }
    ) { padding ->
        LazyColumn {
            items(userChatList) { user ->
                WhatsAppTile(user)
            }
        }
    }

}