package com.example.composeapplication.whatsapp_clone.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composeapplication.R

@Composable
fun IncommingType(type:Boolean) {
    if (type)
    {
        Image(
            painter = painterResource(R.drawable.miss_called),
            contentDescription = "Person Icon",
            modifier = Modifier
                .size(12.dp)
        )
    }else{
        Image(
            painter = painterResource(R.drawable.receive_call),
            contentDescription = "Person Icon",
            modifier = Modifier
                .size(12.dp)
        )
    }
}