package com.example.composeapplication.whatsapp_clone.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.addSpacer
import com.example.composeapplication.R
import userChatList

@Preview(name = "ThirdPartyStatsu")
@Composable
fun ThirdPartyStatus(){
    userChatList.forEach {
        Row(modifier = Modifier.padding(10.dp,10.dp).fillMaxWidth()) {
            addSpacer(0,8)
            Box {
                Image(painter = painterResource(R.drawable.image), contentDescription = "Artist image",
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .border(1.5.dp, Color.Transparent, CircleShape))}
            addSpacer(0,15)
            Column {
                StatusTitle(it.name)
                StatusSubTitle("Today 8:45 AM")
            }
            addSpacer(0,8)
        }
    }

}