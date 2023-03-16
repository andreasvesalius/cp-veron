package com.veron.kotlin.cp2

fun main() {
    print("Berapa banyak case yang akan diminta:")
    var case = readLine()!!.toInt()
    var urutan = 1

    while (case > 0 ){
        print("")
        val start = readLine()!!.toInt()

        print("")
        val end = readLine()!!.toInt()

        var sum = 0

        for (i in start..end) {
            if (i % 2 == 1) {
                sum += i
            }
        }

        println("case #$urutan : $sum")
        urutan += 1
        case -= 1
    }
}