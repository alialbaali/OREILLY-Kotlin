package functions

/*'infix' notation, is used to call a function in a clearer way
* by calling an 'infix' function, we don't have to specifically refer using the dot*/

infix fun String.shouldBeEqualTo(value: String) = this == value // extension function with infix notation

fun main() {
    val output = "Hello"

    output.shouldBeEqualTo("Hello") // calling the extension function without 'infix' notation

    output shouldBeEqualTo "Hello" // calling the extension function with 'infix' notation added to the function
}