package specification

/* Extension function is a function we add to classes we can't change for example 'String' class
* Use '.' dot, we can declare an Extension Function to any class we want to
* 'this' refers to the instance of the object we are operating on
* if we create an Extension function with same signature as a member function, the member function would be called!!!
* */

// Extension function declaration
fun String.hello() { // adding function 'hello()' to class 'String'
    println("Hello ${this.capitalize()}") // implementation of the extension function
}

fun String.toTitleCase(prefix: String): String { // we can pass parameters to the Extension function
    return this.split(" ")
        .joinToString(" ") { "$prefix ${it.capitalize()}" } // here, 'this' refers to the actual string we are calling the method on it
}

fun main() {
    val name = "ali"
    name.hello() // calling the Extension function on a 'String' type variable

    println("this is a sample string to Title Case it.".toTitleCase("Again - "))

    val customer = Customer()
    customer.makePreferred() // calls 'Customer' function and the extension

    val instance: BaseClass = InheritedClass()
    instance.extentionFuntion() // prints the 'BaseClass' extensionFunction

    val instance2: InheritedClass = InheritedClass()
    instance2.extentionFuntion() // prints the 'InheritedClass' extensionFunction

}

class Customer() {
    fun makePreferred() { // member function, this function would be called, not the extended one
        println("Customer version")
    }
}

fun Customer.makePreferred() { // Extension function with a signature similar to a member function
    println("Extended version")
}

open class BaseClass
class InheritedClass : BaseClass()

fun BaseClass.extentionFuntion() {
    println("Base Extension")
}

fun InheritedClass.extentionFuntion() {
    println("Inherited Extension")
}
