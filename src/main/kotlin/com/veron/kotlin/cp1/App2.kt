package com.veron.kotlin.cp1

import java.io.File

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val t = scanner.nextInt()

    for (i in 1..t) {
        val n = scanner.nextInt()
        val matrix = Array(n) { IntArray(n) }

        // read the matrix from input
        for (row in 0 until n) {
            for (col in 0 until n) {
                matrix[row][col] = scanner.nextInt()
            }
        }

        // check if the matrix is symmetric
        var isSymmetric = true
        for (row in 0 until n) {
            for (col in row + 1 until n) {
                if (matrix[row][col] != matrix[col][row]) {
                    isSymmetric = false
                    break
                }
            }
            if (!isSymmetric) {
                break
            }
        }

        // print the result
        println("Test#$i:${if (isSymmetric) "Symmetric" else "Non-symmetric"}.")
    }
}