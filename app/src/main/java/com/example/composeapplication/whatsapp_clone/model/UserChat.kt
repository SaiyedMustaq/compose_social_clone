package com.example.composeapplication.whatsapp_clone.model

data class UserChat(
    var id:Int,
    var image:String,
    var name:String,
    var lastMessage:String,
    var unreadMessage:Int,
    var time:String?=""
)
