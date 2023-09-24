package com.example.composeapplication.postOfficeApp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapplication.ui.theme.secondary
import com.example.composeapplication.ui.theme.textColor

@Composable
fun NormalText(value:String){
    Text(text=value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Italic
        ),
        color = textColor,
        textAlign = TextAlign.Center
    )
}
@Composable
fun HeadingText(value:String){
    Text(text=value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold,
            fontStyle = FontStyle.Normal
        ),
        color = secondary,
        textAlign = TextAlign.Center
    )
}

@Composable
@Preview(name = "NormalText", showSystemUi = true)
fun normalText(){
    Column {
        NormalText(value = "Mustaq ")
        HeadingText(value = "Mustaq")
    }
}