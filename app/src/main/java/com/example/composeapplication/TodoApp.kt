package com.example.composeapplication
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "RememberReturnType")
@Preview(name = "Todo App")
@Composable
fun TodoApp() {

    var nameField by remember {
        mutableStateOf("")
    }
    var nameList by remember {
        mutableStateOf(listOf<String>())
    }

    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "Todo App") }) }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)

            ) {
                OutlinedTextField(
                    value = nameField,
                    placeholder = {
                         Text(text = "Please enter name")
                    },
                    onValueChange =
                    { text ->
                        nameField = text
                    },
                    modifier = Modifier.size(width = 250.dp, height = 60.dp)
                )
                Button(
                    onClick = {
                        nameList = nameList + nameField;
                    },
                ) {
                    Text(text = "Add")
                }
            }
            LazyColumn() {
                items(nameList) { cName ->
                    Box(
                        modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth()
                    ) {
                        Row() {
                            Text(text = cName,
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    color = Color.Blue
                                )
                            )
                            IconButton(onClick = {

                            }) {
                                Icon(imageVector = Icons.Default.Delete,
                                    contentDescription = "",

                                )
                            }
                        }

                    }

                }

            }
        }
    }
}