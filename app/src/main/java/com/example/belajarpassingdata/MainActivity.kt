package com.example.belajarpassingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnApply = findViewById<Button>(R.id.btnApply)
        val etName = findViewById<EditText>(R.id.etName)
        val etAge = findViewById<EditText>(R.id.etAge)
        val etCountry = findViewById<EditText>(R.id.etCountry)

        btnApply.setOnClickListener {
            Intent(this,SecondActivity::class.java).also {
                it.putExtra("EXTRA_PERSON",Person(etName.text.toString(),etAge.text.toString().toInt(),etCountry.text.toString()))
                startActivity(it)
            }
        }
    }
}