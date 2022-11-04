package com.example.androidbasic_musquad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.Toast
import androidx.core.os.HandlerCompat.postDelayed
import androidx.databinding.DataBindingUtil
import com.example.androidbasic_musquad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var isDouble = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "1")
            startActivity(intent)
        }

        binding.image2.setOnClickListener {
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)
        }

        binding.image3.setOnClickListener {
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "3")
            startActivity(intent)
        }

        binding.image4.setOnClickListener {
            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "4")
            startActivity(intent)
        }

        binding.image5.setOnClickListener {
            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "5")
            startActivity(intent)
        }

        binding.image6.setOnClickListener {
            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "6")
            startActivity(intent)
        }

        binding.image7.setOnClickListener {
            Toast.makeText(this, "7번 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "7")
            startActivity(intent)
        }

        binding.image8.setOnClickListener {
            Toast.makeText(this, "8번 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "8")
            startActivity(intent)
        }

        binding.image9.setOnClickListener {
            Toast.makeText(this, "9번 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "9")
            startActivity(intent)
        }

        binding.image10.setOnClickListener {
            Toast.makeText(this, "10번 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "10")
            startActivity(intent)
        }

        binding.image11.setOnClickListener {
            Toast.makeText(this, "11번 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "11")
            startActivity(intent)
        }

        binding.text1.setOnClickListener {
            startActivity(Intent(this, SelectActivity::class.java))
        }

    }

    override fun onBackPressed(){
        if(isDouble == true){
            finish()
        }

        isDouble = true
        Toast.makeText(this, "종료하실려면 더블클릭", Toast.LENGTH_LONG).show()

        Handler().postDelayed({
            isDouble = false
        }, 2000)
    }

}