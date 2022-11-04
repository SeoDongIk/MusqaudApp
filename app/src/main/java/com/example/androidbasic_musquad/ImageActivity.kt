package com.example.androidbasic_musquad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val getData = intent.getStringExtra("data")
        val insideImage = findViewById<ImageView>(R.id.insideimage)

        Log.v("data", getData.toString())

        if(getData == "1"){
            insideImage.setImageResource(R.drawable.rashford)
        }

        if(getData == "2"){
            insideImage.setImageResource(R.drawable.ronaldo)
        }

        if(getData == "3"){
            insideImage.setImageResource(R.drawable.antony)
        }

        if(getData == "4"){
            insideImage.setImageResource(R.drawable.frenkie)
        }

        if(getData == "5"){
            insideImage.setImageResource(R.drawable.casemiro)
        }

        if(getData == "6"){
            insideImage.setImageResource(R.drawable.fernandes)
        }

        if(getData == "7"){
            insideImage.setImageResource(R.drawable.shaw)
        }

        if(getData == "8"){
            insideImage.setImageResource(R.drawable.sancho)
        }

        if(getData == "9"){
            insideImage.setImageResource(R.drawable.varan)
        }

        if(getData == "10"){
            insideImage.setImageResource(R.drawable.dalot)
        }

        if(getData == "11"){
            insideImage.setImageResource(R.drawable.stegen)
        }


    }
}