package functions

/*local function is a function inside another function!
* able to access outer function's parameters & variables in the inside function */

// the outer function
fun foo(fooParam: String) {
    val outerFunction = "Value"

    // the inside function
    fun bar(barParam: String) {
        println(barParam) // have access to the inside function parameter
        println(fooParam) // have access to the outer parameter
        println(outerFunction) // have access to outer variable
    }
}

fun main() {
    foo("Some Value") // calling the outer function
//    bar() we can't access bar() since it's a local function inside foo()// no way to access it

}