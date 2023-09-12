package com.example.kristi_li_assignment_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myName = "Kristi Li"
        val display = findViewById<TextView>(R.id.hellomessage)
        display.text = "Hi, my name is " + myName
    }
}