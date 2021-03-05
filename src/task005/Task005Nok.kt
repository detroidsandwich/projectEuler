package task005

//Задача 5
//Наименьшее кратное
//2520 - самое маленькое число, которое делится без остатка на все числа от 1 до 10.
//
//Какое самое маленькое число делится нацело на все числа от 1 до 20?

private var c: Long = 1

fun main() {
    while (!isDivideWithoutRemainder(c, 1, 20)) {
        c++
    }
    println("nok = $c")
}

fun isDivideWithoutRemainder(num: Long, start: Int, end: Int): Boolean {
    val isDiv = num % end == 0L
    return if (!isDiv || start == end) {
        isDiv
    } else {
        isDivideWithoutRemainder(num, start, end - 1)
    }
}
