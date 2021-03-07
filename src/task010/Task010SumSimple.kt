package task010

import utils.Benchmark
import utils.isPrimeNumber

/*
Сложение простых чисел
Сумма простых чисел меньше 10 равна 2 + 3 + 5 + 7 = 17.

Найдите сумму всех простых чисел меньше двух миллионов.*/

private const val count = 2_000_000

fun main() {
    val bench = Benchmark()
    var sum = 0L
    for (i in 2L..count) {
        if (isPrimeNumber(i)) {
            print("$i ")
            sum += i
        }
    }
    println()
    println()
    println("Total sum= $sum")
    bench.printBenchmark()
}