package com.example.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)  //呼叫父類別的方法,做初始值的設定
        setContentView(R.layout.activity_main)
        R.color.messageColor
    }
}