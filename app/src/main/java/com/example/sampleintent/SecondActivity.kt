package com.example.sampleintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // View取得
        val btnBack : Button = findViewById(R.id.btn)

        //
        btnBack.setOnClickListener {
            finish() // 元画面に戻る（画面のスタックしている状態を外す）
        }
    }
}