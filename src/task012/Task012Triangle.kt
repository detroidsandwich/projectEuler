package task012

import utils.Benchmark
import kotlin.math.sqrt

/*  Задача 12
    Треугольное число с большим количеством делителей
Последовательность треугольных чисел образуется путем сложения натуральных чисел.
К примеру, 7-е треугольное число равно 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. Первые десять треугольных чисел:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Перечислим делители первых семи треугольных чисел:

 1: 1
 3: 1, 3
 6: 1, 2, 3, 6
10: 1, 2, 5, 10
15: 1, 3, 5, 15
21: 1, 3, 7, 21
28: 1, 2, 4, 7, 14, 28
Как мы видим, 28 - первое треугольное число, у которого более пяти делителей.

Каково первое треугольное число, у которого более пятисот делителей?*/

private const val count = 500

fun main() {
    val benchmark = Benchmark()

    var a = 0
    while (true) {
        a++
        val trian = getTriangularNumber(a)
        val value  = getCountDivisors(trian)
        if (value > count) {
            println("Total = $trian")
            benchmark.printBenchmark()
            return
        }
    }
}

private fun getTriangularNumber(count: Int): Int {
    var value = 0
    for (i in 1..count) {
        value += i
    }
    return value
}

private fun getCountDivisors(num: Int): Int {
    var divisors = 2
    val sqrt = sqrt(num.toFloat())
    if (sqrt % 1F == 0F) {
        divisors -= 1
    }
    for (i in 2..sqrt.toInt()) {
        if (num % i == 0) {
            divisors += 2
        }
    }
    return divisors
}