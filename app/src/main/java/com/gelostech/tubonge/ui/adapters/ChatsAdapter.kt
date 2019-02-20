package com.gelostech.tubonge.ui.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gelostech.tubonge.R
import com.gelostech.tubonge.data.models.Chat
import com.gelostech.tubonge.databinding.ItemChatBinding
import com.gelostech.tubonge.ui.callbacks.ChatsCallback
import com.gelostech.tubonge.utils.TimeFormatter
import com.gelostech.tubonge.utils.inflate

class ChatsAdapter(private val callback: ChatsCallback): RecyclerView.Adapter<ChatsAdapter.ChatHolder>() {
    private var chats = mutableListOf<Chat>()

    fun addChat(chat: Chat) {
        chats.add(chat)
        notifyItemInserted(chats.size-1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHolder {
        return ChatHolder(parent.inflate(R.layout.item_chat), callback)
    }

    override fun getItemCount() = chats.size

    override fun onBindViewHolder(holder: ChatHolder, position: Int) {
        holder.bind(chats[position])
    }

    inner class ChatHolder(
        private val binding: ItemChatBinding,
        private val callback: ChatsCallback
    ): RecyclerView.ViewHolder(binding.root) {

        fun bind(chat: Chat) {
            binding.chat = chat
            binding.callback = callback
            binding.timeFormatter = TimeFormatter()
        }

    }

}