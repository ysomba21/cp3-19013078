package com.Billy.kotlin.cp3

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    while (true) {
        val n = sc.nextInt()
        val m = sc.nextInt()
        if (n == 0 && m == 0) {
            break
        }
        val a = Array(n) { 0 }
        for (i in 0 until n) {
            a[i] = sc.nextInt()
        }
        Arrays.sort(a) { x, y ->
            if (x % m != y % m) {
                x % m - y % m
            } else if (x % 2 != y % 2) {
                if (x % 2 == 1) {
                    -1
                } else {
                    1
                }
            } else {
                if (x % 2 == 0) {
                    x - y
                } else {
                    y - x
                }
            }
        }
        println("$n $m")
        for (i in 0 until n) {
            println(a[i])
        }
    }
    sc.close()
}