package com.gelostech.tubonge.ui.callbacks

import android.view.View
import com.gelostech.tubonge.data.models.Chat

interface ChatsCallback {

    fun onChatClicked(v: View, chat: Chat)

}