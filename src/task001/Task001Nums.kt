package task001

/*Числа, кратные 3 или 5
Если выписать все натуральные числа меньше 10, кратные 3 или 5, то получим 3, 5, 6 и 9. Сумма этих чисел равна 23.

Найдите сумму всех чисел меньше 1000, кратных 3 или 5.*/

private var c = 1000

fun main() {
    var sum = 0
    val fiveList = allMultiples(c, 5)
    val threeList = allMultiples(c, 3)
    println(" list = $fiveList")
    println(" list = $threeList")
    fiveList.forEach { sum += it }
    threeList.forEach { sum += it }
    println(" sum = $sum")
}

private fun allMultiples(num: Int, multiple: Int): List<Int> {
    val list = mutableListOf<Int>()
    for (i in 1..num / multiple) {
        val a = i * multiple
        if (a < num) {
            list.add(a)
        }
    }
    return list
}