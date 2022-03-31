package com.example.telawhatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.telawhatsapp.adapter.ChatRecyclerAdapter
import com.example.telawhatsapp.model.ChatDataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var chatRecyclerAdapter: ChatRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSource()
    }

    private fun addDataSource() {
        val chatDataSource = ChatDataSource.createDataSet()
        this.chatRecyclerAdapter.setDataSet(chatDataSource)
    }

    private fun initRecyclerView() {
        this.chatRecyclerAdapter = ChatRecyclerAdapter()
        chat_list.layoutManager =  LinearLayoutManager(this)
        chat_list.adapter = this.chatRecyclerAdapter
    }
}