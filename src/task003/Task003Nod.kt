package task003

//Наибольший простой делитель
//Простые делители числа 13195 - это 5, 7, 13 и 29.
//
//Каков самый большой делитель числа 600851475143, являющийся простым числом?

private var numMax = 600851475143L
private var c = 0L
// Not work
fun main() {

    for (i in numMax - 1 downTo 2) {
        val isDivide = numMax % i == 0L
        if (isDivide) {
            println("divider = " + i)
            val isSimple = isSimpleNum(i)
            if (isSimple) {
                c = i
                break
            }
        }
    }

    println("a = $c it is simple ")
}

private fun isSimpleNum(num: Long) = isSimpleNum(num, 2)

private fun isSimpleNum(num: Long, step: Long): Boolean {
    val isDivide = num % step == 0L
    return when {
        isDivide && step < num -> false
        isDivide && step == num -> true
        else -> isSimpleNum(num, step + 1)
    }
}
