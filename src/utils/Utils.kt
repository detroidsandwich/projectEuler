package utils

import kotlin.math.sqrt

fun isPrimeNumber(num: Long): Boolean {
    val count = if (num > 10) sqrt(num.toDouble()).toLong() else num
    for (i in 2 until count) {
        if (num % i == 0L) {
            return false
        }
    }
    return true
}

fun isPrimeNumber(num: Int): Boolean {
    val count = if (num > 10) sqrt(num.toDouble()).toInt() else num
    for (i in 2 until count) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}