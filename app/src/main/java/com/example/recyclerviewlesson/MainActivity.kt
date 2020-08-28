package com.example.recyclerviewlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


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

        var datarr = ArrayList<DataInfo>()
        datarr.add(DataInfo(R.drawable.a1, "Apple",50))
        datarr.add(DataInfo(R.drawable.a2, "banana",60))
        datarr.add(DataInfo(R.drawable.a3, "banana",60))
        datarr.add(DataInfo(R.drawable.a4, "banana",60))
        datarr.add(DataInfo(R.drawable.a5, "banana",60))
        datarr.add(DataInfo(R.drawable.a6, "banana",60))
        datarr.add(DataInfo(R.drawable.a7, "banana",60))


        mRecyclerView = findViewById(R.id.recyclerView)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = MyAdapter(datarr, this)
    }
}