package com.example.telawhatsapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.telawhatsapp.R
import com.example.telawhatsapp.model.Chat
import kotlinx.android.synthetic.main.layout_chat_list.view.*

class ChatRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items : List<Chat> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return ChatViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_chat_list, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder) {

            is ChatViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(chat: List<Chat>) {
        this.items = chat
    }

    class ChatViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val chatTitle = itemView.chat_title
        private val chatDate = itemView.last_message_datetime
        private val chatDescription = itemView.last_message

        fun bind(chat: Chat) {
            chatTitle.text = chat.title
            chatDate.text = chat.date
            chatDescription.text = chat.description
        }
    }
}