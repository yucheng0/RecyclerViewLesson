package com.example.recyclerviewlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    private lateinit var mRecyclerView: RecyclerView
    val items = listOf(
        "apple",
        "banana",
        "cherry",
        "durian",
        "grape",
        "honeydew melon",
        "lemon",
        "orange",
        "kiwi fruit",
        "papaya",
        "tangerine",
        "watermelon"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView = findViewById(R.id.recyclerView)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = MyAdapter(items, this)

    }
}