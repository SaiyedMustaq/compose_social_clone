package com.example.composeapplication.whatsapp_clone.scaled

import ComposableFun
import com.example.composeapplication.R
import com.example.composeapplication.whatsapp_clone.CallScreen
import com.example.composeapplication.whatsapp_clone.ChatScreen
import com.example.composeapplication.whatsapp_clone.StatusScreen

sealed class TabItem(var icon: Int, var title: String, var screen: ComposableFun) {
    object Chat : TabItem(R.drawable.us, "Chat", { ChatScreen() })
    object Status : TabItem(R.drawable.us, "Status", { StatusScreen() })
    object Call : TabItem(R.drawable.us, "Call", { CallScreen() })
}