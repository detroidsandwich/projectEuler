package task003

//Наибольший простой делитель
//Простые делители числа 13195 - это 5, 7, 13 и 29.
//
//Каков самый большой делитель числа 600851475143, являющийся простым числом?

private var numMax = 600851475143
private var y = 0

fun main() {
    val a : Long = numMax
    for(i in numMax downTo 1){

    }

    println("a = " + a + " is simple = " + isSimpleNum(a))
    print("y= " + y)
}

private fun isSimpleNum(num: Long): Boolean {
    //var d = num.toFloat()
    var i: Long = 2
    while(i != num+1){
        var x : Long = num % i
        i++
        if (x == 0L) y++
        if (y > 1) return false
    }
    return true
}


//for(int i = 2; i == x; i++){
//    x %= num / i;
//    if (x == 0)
//        y++;
//    if (y == 1)
//        list[n] = num;
//}
