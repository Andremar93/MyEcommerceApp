package com.example.myecommerceapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnToLifeCycleDemoActivity)
        button.setOnClickListener {
            val intent = Intent(this, LifeCycleDemoActivity::class.java)
            startActivity(intent)
        }


        val btnA = findViewById<Button>(R.id.btnFragmentA)
        val btnB = findViewById<Button>(R.id.btnFragmentB)

        btnA.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, AFragment())
                .commit()
        }

        btnB.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, BFragment())
                .commit()
        }

    }
}
