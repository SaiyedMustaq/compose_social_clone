package com.example.composeapplication.whatsapp_clone

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.addSpacer
import com.example.composeapplication.R
import com.example.composeapplication.whatsapp_clone.widgets.MyStatus
import com.example.composeapplication.whatsapp_clone.widgets.ThirdPartyStatus
import com.example.composeapplication.whatsapp_clone.widgets.WhatsAppAppBar

@Preview(name = "StatusList", showSystemUi = true)
@Composable
fun StatusScreen(){
    Scaffold(
        floatingActionButton = {
            Column {
                FloatingActionButton(
                    backgroundColor = colorResource(R.color.teal_Dark_Green),
                    contentColor = colorResource(R.color.white),
                    onClick = { },
                ) {
                    Icon(Icons.Filled.Edit, "Floating action button.")
                }
                addSpacer(5,0)
                FloatingActionButton(
                    backgroundColor = colorResource(R.color.teal_Dark_Green),
                    contentColor = colorResource(R.color.white),
                    onClick = { },
                ) {
                    Icon(Icons.Filled.Add, "Floating action button.")
                }
            }

        }
    ){ padding->
        LazyColumn(Modifier.fillMaxSize()) {
            item {
                Box(modifier = Modifier
                    .padding(20.dp,20.dp)) {
                    MyStatus()
                }
            }
            item {
                Text("Recent Update",modifier = Modifier
                    .padding(20.dp,10.dp))
            }
            item {
                ThirdPartyStatus()
            }
            item {
                Text("Recent Update",modifier = Modifier
                    .padding(20.dp,10.dp))
            }
            item {
                ThirdPartyStatus()
            }
        }
    }

}















