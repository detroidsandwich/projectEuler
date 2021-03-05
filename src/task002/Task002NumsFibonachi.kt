package task002

/*Четные числа Фибоначчи
Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих.
Начиная с 1 и 2, первые 10 элементов будут:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.*/

private var maxFibonachi = 4000000

fun main() {
    val listF = mutableListOf<Int>()
    var sum = 0
    var a = 1
    var fibonachi = 1
    do {
        if (fibonachi % 2 == 0) {
            sum += fibonachi
        }
        listF.add(fibonachi)

        val b = fibonachi
        fibonachi += a
        a = b
    } while (fibonachi < maxFibonachi)

    println(" list = $listF")
    println(" sum = $sum")
}

