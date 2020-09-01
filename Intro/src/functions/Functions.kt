package functions

fun hello(): Unit { // declaring a function with no parameters & with return type void || Unit
    println("Hello")

}

fun throwingExceptino(): Nothing { // a function that doesn't return any value but just throw an exception
    throw Exception("this function throws an exception")
}


fun returnInt(): Int {
    return 4
}

fun takiingString(name: String) { // function takes String 'name' as a parameter
    println(name)
}

fun sum(x: Int, y: Int): Int { // function takes two parameters with
    return x + y
}

// no need to specify the return type, since we already specified them in the parameters
fun divide(x: Double, y: Double) = x / y // function expression for single line functions with just return value


fun multiply(x: Int = 0, y: Int = 0) = x * y // a function with default parameters

fun printStrings(vararg strings: String) { // a function takes unlimited parameters (of type 'String') using 'vararg'
        for (string in strings) {
        println(string)
    }
}

fun printNames(vararg names: String) {
//    forPrintingNames(names) wouldn't work cuz we need to specify that we are passing a 'vararg'
    // so instead we use
    forPrintingNames(*names) // the star helps call functions with 'vararg' as a parameter
}

fun forPrintingNames(vararg names: String) {
    for (name in names) {
        println(name)
    }
}

fun main() {
    hello()
    val value = returnInt()

    divide(10.3, 20.5)

    multiply() // calling a function with default parameters
    multiply(23, 54) // calling a function with changed parameters


    multiply(x = 10) // specifying the parameter by naming it (named parameters)
    multiply(y = 15)
    multiply(y = 34, x = 324)

    // calling a function with unlimited parameters
    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")
    printStrings("1", "2", "3" + "4")


}
