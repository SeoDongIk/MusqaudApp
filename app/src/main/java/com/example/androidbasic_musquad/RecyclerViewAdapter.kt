package com.example.androidbasic_musquad

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val items : MutableList<LIstViewModel>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.individual2, parent, false)

        return ViewHolder(view)
    }

    interface ItemClick{
        fun onClick(view: View, position : Int)
    }

    var itemClick : ItemClick? = null

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {

        if(itemClick != null){
            holder.itemView.setOnClickListener { v->
                itemClick?.onClick(v, position)
            }
        }
        holder.bindItems(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(item : LIstViewModel){
            val individualtext2 = itemView.findViewById<TextView>(R.id.individualtext2)
            individualtext2.setText("나는 맨유의" + item.title + "이자" + item.content + "라고 할 수 있지")
        }
    }


}