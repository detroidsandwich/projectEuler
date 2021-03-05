package task006

/*Разность между суммой квадратов и квадратом суммы
Сумма квадратов первых десяти натуральных чисел равна

12 + 22 + ... + 102 = 385
Квадрат суммы первых десяти натуральных чисел равен

(1 + 2 + ... + 10)2 = 552 = 3025
Следовательно, разность между суммой квадратов и квадратом суммы первых десяти натуральных чисел составляет 3025 − 385 = 2640.

Найдите разность между суммой квадратов и квадратом суммы первых ста натуральных чисел.*/

private val count = 100

fun main() {

    var sumSquare = 0
    for (i in 1..count) {
        val sqr = i * i
        sumSquare += sqr
    }

    var squareSum = 0
    for (i in 1..count) {
        squareSum += i
    }
    squareSum *= squareSum

    val total = squareSum - sumSquare
    println(" $squareSum - $sumSquare = $total")
}