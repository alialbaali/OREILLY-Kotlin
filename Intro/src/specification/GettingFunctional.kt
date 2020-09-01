package specification

//TODO
/*High order functions are functions take another functions as parameters
* */

// syntax for a function that takes two integers
// and takes a function which takes also two integers and return Int value
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int): Int = x + y


fun main() {


}

fun add(x: Double, y: Double): Double {
    return x + y
}

fun addWith(z: Double, add: (Double, Double) -> Double): Double {
    return z
}