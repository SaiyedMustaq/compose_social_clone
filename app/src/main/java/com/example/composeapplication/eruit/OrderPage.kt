package com.example.composeapp

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapplication.R

@Composable()
fun OrderPage(
) {
    val myData = listOf("", "","","","","", "","","","")
    LazyColumn {
        items(myData) { item ->
            OrderTile()
        }
    }
}

@Preview(name = "OrderTile", showSystemUi = true)
@Composable
fun OrderTilePreview(){
    OrderPage()
}

@Composable
fun OrderTile(){
        Card(
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.padding(4.dp).fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Transparent),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)

        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .background(color = colorResource(id = R.color.white))
                    .padding(horizontal = 20.dp, vertical = 10.dp)
                    .fillMaxWidth()
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                ) {
                    MyImageBox()
                    Column(
                        modifier = Modifier
                            .padding(start=10.dp)
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically,
                        ){
                            Text("Customer Name")
                            addSpacer(hSpace = 5)
                            Box(modifier = Modifier
                                .size(10.dp)
                                .clip(CircleShape)
                                .background(color = colorResource(id = R.color.black))
                            )
                        }
                        Text("#Order no")
                        Text("145874")
                    }
                }
                Image(
                    modifier = Modifier
                        .size(height = 80.dp, width = 20.dp),
                    painter = painterResource(R.drawable.arrow_forward_black),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                )

            }
        }
}


@Composable
fun MyImageBox(){
    Box(
        Modifier
    ) {
        Image(
            modifier = Modifier
                .size(height = 80.dp, width = 100.dp),
            painter = painterResource(R.drawable.order_image),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
        )
        Box(
            modifier = Modifier
                .padding(start = 8.dp, top = 8.dp)
                .clip(shape = RoundedCornerShape(4.dp))
                .background(color = colorResource(id = R.color.white))
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(start = 2.dp, end = 2.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
            ) {
                Text(text = "22",
                    style = TextStyle(fontSize = 15.sp,color = colorResource(id = R.color.primaryColor)),
                    modifier = Modifier
                    .padding())
                Text(text = "May", style = TextStyle(fontSize = 15.sp))
            }
        }
    }
}