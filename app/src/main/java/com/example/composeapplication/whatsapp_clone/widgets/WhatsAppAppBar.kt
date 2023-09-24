package com.example.composeapplication.whatsapp_clone.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapplication.R

@Preview(name="TitleBar")
@Composable
fun WhatsAppAppBar(){
    TopAppBar(
        title = { Text(text = "WhatsApp")},
        contentColor = colorResource(R.color.white),
        backgroundColor = colorResource(R.color.teal_Dark_Green),
        elevation = 0.dp,
        actions = { Row(
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(painter = painterResource(R.drawable.camera),
                contentDescription = "",
                modifier = Modifier
                    .padding(12.dp)
                    .size(20.dp))
            Image(painter = painterResource(R.drawable.search),
                contentDescription = "",
                modifier = Modifier.padding(12.dp).size(20.dp))
            Image(painter = painterResource(R.drawable.menu),
                contentDescription = "",
                modifier = Modifier
                    .padding(12.dp).size(20.dp))
        }}
    )
}