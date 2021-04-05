package com.example.viselitsa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            if (findViewById<EditText>(R.id.editTextTextPersonName).text.toString() == "Liza") {
                findViewById<EditText>(R.id.editTextTextPersonName).error == "неправильный логин"
            }
        }
    }
}