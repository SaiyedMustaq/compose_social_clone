package com.example.composeapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapplication.ui.theme.ComposeApplicationTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun IntagramApp() {

    var onOff by remember {
        mutableStateOf(false)
    }

    var checkOn by remember {
        mutableStateOf(false)
    }
    var tField by remember {
        mutableStateOf("")
    }
    
    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "UserName") }) }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        
        ) {
            Box(
                modifier = Modifier
                    .background(Color.Gray)
                    .border(width = 2.dp, color = Color.Blue)

            ) {
                Icon(imageVector = Icons.Default.Person,
                    contentDescription = "",
                    modifier = Modifier
                        .size(108.dp)

                )
            }
            Text(text = "HELLO")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Text Button")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Filled Button")
                }
                OutlinedButton(onClick = { /*TODO*/ }) {
                    Text(text = "Outline Button")
                }
            }

            
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Switch(checked = onOff, onCheckedChange ={
                    onOff=!onOff
                } )
                Checkbox(checked = checkOn, onCheckedChange ={
                    checkOn=!checkOn
                } )
            }

            TextField(value =tField , onValueChange ={t-> tField=t},modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth() )
            Box(modifier = Modifier.size(12.dp))
                

            BasicTextField(value = tField, onValueChange ={t->tField=t} ,
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(60.dp)
            )
            Box(modifier = Modifier.size(12.dp))
            OutlinedTextField(value = tField, onValueChange ={t->tField=t},modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth() )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeApplicationTheme {
        IntagramApp()
    }
}