package com.example.guess

import java.util.Random

class SecretNumber{
    val secret = Random().nextInt(10) +1
    var count = 0  //次數


    fun validate (number: Int): Int{  //比對功能
        count++  //猜了幾次的加總
        return  number - secret
    }
}

fun main() {
    val secretNumber = SecretNumber()  //呼叫建構子
    println(secretNumber.secret)  //產生秘密數字
    println("${secretNumber.validate(number = 2)}, count: ${secretNumber.count}")
}