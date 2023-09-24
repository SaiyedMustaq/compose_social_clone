package com.example.composeapplication.postOfficeApp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapplication.postOfficeApp.components.HeadingText
import com.example.composeapplication.postOfficeApp.components.NormalText
import com.example.composeapplication.postOfficeApp.components.PostTextField
import com.example.composeapplication.ui.theme.ComposeApplicationTheme

@Composable
fun SingUpOne() {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(25.dp)) {
            Column(modifier = Modifier.fillMaxSize()) {
                NormalText(value = "Hay there")
                Spacer(modifier = Modifier.height(12.dp))
                HeadingText(value = "Create new account")
                Spacer(modifier = Modifier.height(12.dp))
                PostTextField(labelValue = "First Name", leadingIcon = Icons.Default.Person)
                Spacer(modifier = Modifier.height(12.dp))
                PostTextField(labelValue = "Last Name", leadingIcon = Icons.Default.Person)
                Spacer(modifier = Modifier.height(12.dp))
                PostTextField(labelValue = "Emial", leadingIcon = Icons.Default.Email)
                Spacer(modifier = Modifier.height(12.dp))
                PostTextField(labelValue = "Password", leadingIcon = Icons.Default.Lock)
            }
        }
}

@Composable
@Preview(name = "SingUpOne")
fun SignUpOnePreview(){
    ComposeApplicationTheme {
        SingUpOne()
    }
}




