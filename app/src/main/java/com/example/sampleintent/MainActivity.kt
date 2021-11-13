package com.example.sampleintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // viewの取得
        val btnStart :Button = findViewById(R.id.btnStart)

        // ボタン押下で次の画面へ
        btnStart.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            println("aaaaa")
            startActivity(intent)
        }
    }class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // viewの取得
            val btnStart :Button = findViewById(R.id.btnStart)

            // ボタン押下で次の画面へ
            btnStart.setOnClickListener {
                val intent = Intent(this,SecondActivity::class.java)
                println("aaaaa")
                startActivity(intent)
            }
        }
    }
}