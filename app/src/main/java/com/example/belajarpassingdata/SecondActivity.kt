package com.example.belajarpassingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val tvPerson = findViewById<TextView>(R.id.tvPerson)
        val textName = intent.getSerializableExtra("EXTRA_PERSON") as Person
        tvPerson.setText(textName.toString())
    }
}