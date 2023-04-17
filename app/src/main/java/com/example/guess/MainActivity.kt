package com.example.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.guess.databinding.ActivityMainBinding
//import kotlinx.android.synthetic.main.activity_main.*  //這個插件不能使用了,改用上一行

class MainActivity : AppCompatActivity() {
    val secretNumber = SecretNumber()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)  //呼叫父類別的方法,做初始值的設定
//        setContentView(R.layout.activity_main)  //改用下方這行

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("MainActivity", "secret:" + secretNumber.secret)
    }

    //改用binding來取得畫面元件
    fun check(view: View){
        val n = binding.number.text.toString().toInt()    //取得輸入方塊的文字,再將文字轉成整數
        println("number: $n")
        Log.d("MainActivity", "number" + n)
        val diff = secretNumber.validate(n)
        var message = "Yes, you got it"
        if(diff < 0) {
            message = "Bigger"
        }else if(diff > 0) {
            message = "Smaller"
        }
//            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)  //建置對話框
            .setTitle("Message")  //設定標題
            .setMessage(message)
            .setPositiveButton("OK", null)  //設定訊息框內的按鈕
            .show()  //顯示對話框

//        if(diff < 0) {
//            Toast.makeText(this, "Bigger", Toast.LENGTH_LONG).show()
//        }else if(diff > 0) {
//            Toast.makeText(this, "Smaller", Toast.LENGTH_LONG).show()
//        }else {
//            Toast.makeText(this, "Yes, you got it", Toast.LENGTH_LONG).show()
//        }
    }
}