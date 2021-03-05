package task004

/*Наибольшее произведение-палиндром
Число-палиндром с обеих сторон (справа налево и слева направо) читается одинаково.
Самое большое число-палиндром, полученное умножением двух двузначных чисел – 9009 = 91 × 99.

Найдите самый большой палиндром, полученный умножением двух трехзначных чисел.*/

private var a = 0
private var b = 0
private var maxpoly = 0

fun main() {

    for (i in 100..998) {
        for (j in 100..998) {
            val max = i * j
            if (isPalindrome(max)) {
                if (max > maxpoly) {
                    maxpoly = max
                    a = i
                    b = j
                }
            }
        }
    }
    println("max poly = $maxpoly")
    println("$a * $b")
}

fun isPalindrome(num: Int): Boolean {
    return reverse(num) == num
}

fun reverse(num: Int): Int {
    var rnum1 = 0
    var i = num
    while (i != 0) {
        rnum1 = rnum1 * 10 + i % 10
        i /= 10
    }
    return rnum1
}