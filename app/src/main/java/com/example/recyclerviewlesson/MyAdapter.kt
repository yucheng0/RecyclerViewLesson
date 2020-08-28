package com.example.recyclerviewlesson

import android.content.Context
import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itemlayout.view.*

val TAG = "myTag"
class MyAdapter(val items: ArrayList<DataInfo> ,var context: Context):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
// 嵌套類
    class MyViewHolder(val myview: View) : RecyclerView.ViewHolder(myview) {
       val imageview = myview.findViewById<ImageView>(R.id.imageView)
       val textview = myview.findViewById<TextView>(R.id.textView)
        val tvprice = myview.findViewById<TextView>(R.id.tvPrice)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val myview = LayoutInflater.from(p0.context).inflate(R.layout.itemlayout,p0,false)
        return MyViewHolder(myview)
    }

       override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
           p0.imageview.setImageResource(items[p1].image)
        p0.textview.text = items[p1].fruit
        p0.tvprice.text = items[p1].price.toString()
     }

    override fun getItemCount(): Int = items.size


}


