package com.example.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(R.layout.activity_second) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val phone2 = intent.getStringExtra("Phone")
        val tvText = findViewById<TextView>(R.id.tvText)
        tvText.text = phone2.toString()

        val button = findViewById<Button>(R.id.bnCall)
        button.setOnClickListener {
            val intent = Intent (Intent.ACTION_CALL)
            intent.data = Uri.parse ("tel:" + phone2.toString())
            startActivity (intent)
        }
    }
}