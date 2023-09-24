package com.example.composeapplication.whatsapp_clone.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.addSpacer

@Preview(name = "MyStatusView")
@Composable
fun MyStatus(){
    Row(modifier = Modifier.padding(0.dp,8.dp).fillMaxWidth()) {
        addSpacer(0,8)
        ArtistAvatar()
        addSpacer(0,15)
        Column {
                StatusTitle("My Status")
                StatusSubTitle("Tap to add status update")
        }
        addSpacer(0,8)
    }
}