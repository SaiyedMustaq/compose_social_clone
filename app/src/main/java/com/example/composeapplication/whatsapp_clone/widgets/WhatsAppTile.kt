package com.example.composeapplication.whatsapp_clone.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.addSpacer
import com.example.composeapplication.R
import com.example.composeapplication.whatsapp_clone.model.UserChat


@Composable
fun WhatsAppTile(user: UserChat) {
    Row(modifier = Modifier
        .padding(all = 10.dp)
        .fillMaxWidth()) {
            CircleImageUser()
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = user.name,
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W600,
                        )
                    )
                    if(user.unreadMessage==0) {
                        Text(
                            text = user.time.toString(), style = TextStyle(
                                color = Color.Gray,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.W600,
                            )
                        )
                    }else{
                        Text(text = user.time.toString(), style = TextStyle(
                            color = Color(7,94,84),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                        ))
                    }
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(text = user.lastMessage, style = TextStyle(
                        color = Color.Gray,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.W400,
                    ))
                    if(user.unreadMessage!=0)
                        Text(
                            modifier = Modifier
                                .padding(start = 0.dp, end = 5.dp, top = 0.dp, bottom = 0.dp)
                                .drawBehind {
                                    drawCircle(
                                        color = Color(7,94,84),
                                        radius = this.size.minDimension
                                    )

                                },
                            color = Color.White,
                            text = user.unreadMessage.toString(),
                        )
                }

            }
        }
}