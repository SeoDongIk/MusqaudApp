package com.example.androidbasic_musquad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.androidbasic_musquad.databinding.ActivitySelectBinding
import kotlin.random.Random

class SelectActivity : AppCompatActivity() {

    private lateinit var binding2 : ActivitySelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        binding2 = DataBindingUtil.setContentView(this, R.layout.activity_select)

        binding2.btn1.setOnClickListener{

            var randomnumber = Random.nextInt(0,12)
            Log.d("random", randomnumber.toString())

            if(randomnumber == 1){
                binding2.randomview.setImageResource(R.drawable.rashford)
            }

            if(randomnumber == 2){
                binding2.randomview.setImageResource(R.drawable.ronaldo)
            }

            if(randomnumber == 3){
                binding2.randomview.setImageResource(R.drawable.antony)
            }

            if(randomnumber == 4){
                binding2.randomview.setImageResource(R.drawable.frenkie)
            }

            if(randomnumber == 5){
                binding2.randomview.setImageResource(R.drawable.casemiro)
            }

            if(randomnumber == 6){
                binding2.randomview.setImageResource(R.drawable.fernandes)
            }

            if(randomnumber == 7){
                binding2.randomview.setImageResource(R.drawable.shaw)
            }

            if(randomnumber == 8){
                binding2.randomview.setImageResource(R.drawable.sancho)
            }

            if(randomnumber == 9){
                binding2.randomview.setImageResource(R.drawable.varan)
            }

            if(randomnumber == 10){
                binding2.randomview.setImageResource(R.drawable.dalot)
            }

            if(randomnumber == 11){
                binding2.randomview.setImageResource(R.drawable.stegen)
            }


        }

        binding2.btn2.setOnClickListener {
            startActivity(Intent(this, InformationActivity::class.java))
        }

        binding2.btn3.setOnClickListener {
            startActivity(Intent(this, Information2Activity::class.java))
        }

    }
}