package task007

import utils.Benchmark
import utils.isPrimeNumber

/*
10001-е простое число
Выписав первые шесть простых чисел, получим 2, 3, 5, 7, 11 и 13. Очевидно, что 6-е простое число - 13.

Какое число является 10001-м простым числом?*/

private const val count = 10_001

fun main() {
    val bench = Benchmark()
    var x = 1
    var i = 1L
    while (x <= count) {
        i++
        if (isPrimeNumber(i)) {
            println("count $x = $i")
            x++
        }
    }

    println()
    println("$count prime number is $i")
    bench.printBenchmark()
}