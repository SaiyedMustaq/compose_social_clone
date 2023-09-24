package com.example.composeapplication.whatsapp_clone.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapplication.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

@Preview(name = "StatusCircle")
@Composable
fun ArtistAvatar() {
    Box {
        Image(painter = painterResource(R.drawable.image), contentDescription = "Artist image",
                                modifier = Modifier.size(44.dp)
                        .clip(CircleShape)
                        .border(1.5.dp, Color.Transparent, CircleShape))
        Icon(
            Icons.Filled.Add, contentDescription = "Check mark",
            tint = Color.White,
            modifier = Modifier
                .padding(top = 25.dp, start = 25.dp)
                .align(Alignment.BottomEnd)
                .clip(CircleShape)
                .border(1.5.dp, Color.Transparent, CircleShape)
                .background(color = colorResource(R.color.teal_Green)))
    }
}