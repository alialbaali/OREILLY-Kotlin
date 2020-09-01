package functions

/*Recursion example like, fibonacci, factorials
* Recursion could lead to StackOverFlowException, cuz we are calling function over and over
* using 'tailrec' modifier optimizes a recursive function
* and instead of having a function calls itself with different input values,
* the 'tailrec' replace the call with a forLoop or "'GOTO' in binary code"  */

// Recursive function without 'tailrec' modifier
fun factorial(number: Int): Int {
    return when (number) {
        0, 1 -> 1
        else -> number * factorial(number.minus(1))
    }
}

// Recursive function with 'trairec' modifier
// you can check the 'GOTO' in the binary code of this function
tailrec fun factorialTR(number: Int, accumulator: Int = 1): Int {
    return when (number) {
        0 -> accumulator
        else -> factorialTR(number.minus(1), accumulator = number)
    }
}

fun main() {
    println(factorial(5))
    println(factorialTR(5))

}