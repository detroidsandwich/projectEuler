package task009

import utils.Benchmark

//Особая тройка Пифагора
//Тройка Пифагора - три натуральных числа a < b < c, для которых выполняется равенство
//
//a^2 + b^2 = c^2
//Например, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
//Существует только одна тройка Пифагора, для которой a + b + c = 1000.
//Найдите произведение abc.

private var count = 1000

fun main() {
    val benchmark = Benchmark()
    var m = 1

    while (m < count) {
        m++
        for (n in 1..m) {
            val a = (m * m) - (n * n)
            val b = 2 * m * n
            val c = (m * m) + (n * n)

            println("m= $m n= $n a= $a b= $b c= $c     sum = ${a + b + c}")
            if (a + b + c == count) {
                println("Total a*b*c = ${a * b * c}")
                benchmark.printBenchmark()
                return
            }
        }
    }
    benchmark.printBenchmark()
}