package com.example.androidbasic_musquad

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ListViewAdapter(val List : MutableList<LIstViewModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(p0: Int): Any {
        return List[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var converView = p1

        if(converView == null){
            converView = LayoutInflater.from(p2?.context).inflate(R.layout.individual, p2, false)
        }

        val description = converView!!.findViewById<TextView>(R.id.individualtext)

        description.setText("나는" + List[p0].content + List[p0].title + "입니다")

        return converView!!
    }
}