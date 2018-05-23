package com.example.tuneonlyme.whatsyourage

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tuneonlyme.whattowatch.R
import com.example.tuneonlyme.whattowatch.R.id.StartBtn
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        StartBtn.setOnClickListener {
            val intent = Intent(this, activity2::class.java)
            startActivity(intent)
        }
    }

}
