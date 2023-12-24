package com.example.chapter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val plusButton = findViewById<Button>(R.id.plusButton)
        val resetButton = findViewById<Button>(R.id.resetButton)

        var number = 0

        resetButton.setOnClickListener {
            //Log.d("onClick","리셋 버튼이 클릭 됐습니다.")
            number = 0
            numberTextView.text = number.toString()
        }
        plusButton.setOnClickListener {
            //Log.i("onClick","플러스 버튼이 클릭 됐습니다.")
            number += 1
            numberTextView.text = number.toString()
        }
    }
}