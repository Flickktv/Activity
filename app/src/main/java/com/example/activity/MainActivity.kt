package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.bnBar)

        button.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            val phone = findViewById<EditText>(R.id.etText).text.toString()
            intent.putExtra("Phone", phone)
            startActivity(intent)
        }


    }
}