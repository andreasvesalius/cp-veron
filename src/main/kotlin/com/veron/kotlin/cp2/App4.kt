package com.veron.kotlin.cp2

fun main() {
    print("How many case? ")
    val num = readLine()!!.toInt()
    repeat(num){
        print("a:")
        val a = readLine()!!.toInt()
        print("b:")
        val b = readLine()!!.toInt()
        val sum =(a..b).filter { it % 2 ==1}.sum()
        println("Case #${it+1} = $sum")
    }
}