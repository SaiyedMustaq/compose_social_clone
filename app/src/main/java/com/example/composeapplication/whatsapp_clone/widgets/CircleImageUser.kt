package com.example.composeapplication.whatsapp_clone.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composeapplication.R

@Composable
fun CircleImageUser(){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(45.dp)
            .border(
                width = 2.dp,
                color = colorResource(id = R.color.teal_Green),
                shape = CircleShape
            ),
    ) {
        Image(
            painter = painterResource(R.drawable.image),
            contentDescription = null,
            modifier = Modifier
                .size(44.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colors.primary, CircleShape)
        )
    }
}