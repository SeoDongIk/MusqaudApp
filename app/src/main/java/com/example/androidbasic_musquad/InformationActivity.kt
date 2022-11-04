package com.example.androidbasic_musquad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import com.example.androidbasic_musquad.databinding.ActivityInformationBinding
import com.example.androidbasic_musquad.databinding.ActivitySelectBinding

class InformationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        val list = mutableListOf<LIstViewModel>()

        list.add(LIstViewModel("Rashford", "LW"))
        list.add(LIstViewModel("Ronaldo", "ST"))
        list.add(LIstViewModel("Antony", "RW"))

        val listview = findViewById<ListView>(R.id.listview1)
        val listAdapter = ListViewAdapter(list)

        listview.adapter = listAdapter

    }
}