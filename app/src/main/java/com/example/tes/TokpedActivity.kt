package com.example.tes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TokpedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tokped)
        val menua1 = findViewById<ImageButton>(R.id.menu_i)
        menua1.setOnClickListener {
            setContentView(R.layout.activity_main)
        }
        }
}