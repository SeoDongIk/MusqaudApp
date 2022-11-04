package com.example.androidbasic_musquad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Information2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information2)

        val list = mutableListOf<LIstViewModel>()

        list.add(LIstViewModel("Rashford", "LW"))
        list.add(LIstViewModel("Ronaldo", "ST"))
        list.add(LIstViewModel("Antony", "RW"))

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview1)
        val recyclerAdapter = RecyclerViewAdapter(list)

        recyclerview.adapter = recyclerAdapter
        recyclerview.layoutManager = LinearLayoutManager(this)

        recyclerAdapter.itemClick = object : RecyclerViewAdapter.ItemClick{
            override fun onClick(view: View, position : Int){
                if(position == 0){
                    startActivity(Intent(baseContext, RashfordActivity::class.java))
                }
                if(position == 1){
                    startActivity(Intent(baseContext, RonaldoActivity::class.java))
                }
                if(position == 2){
                    startActivity(Intent(baseContext, AntonyActivity::class.java))
                }
            }
        }

    }
}