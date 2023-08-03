fun main() {
  val pow = printPow(3,5)
    println(pow)
}


fun printPow ( base: Int, exponent: Int): Int {
    var result = 1
    for(i in 1.. exponent) {
        result *= base
    }
    return result
}