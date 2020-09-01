package inheritance



/*
* the base class for any class is 'Any'
* A class is closed (final) by default, we use 'open' to make it inheritable
* all attributes and functions are closed (final) by default, to override them, we MUST use 'open' keyword!
*/

open class Person : Any() { // You don't have to type 'Any' cuz, it already inherit from 'Any()'
    open val age: Int = 10 // using 'open' we can override it
    open fun validate() { // functions are closed (final) by default too. we use 'open' to make them inheritable

    }
}

open class Customer : Person {
   override val age = 20 // wouldn't work unless 'age' is marked as 'open'
    final override fun validate() { // we can mark this function to final so that the inherited classes don't override them.

    }

    constructor() : super() { // 'super' is referring to the base class constructor

    }

}

class SpecialCustomer : Customer() {
//    override fun validate() { super.validate() } // wouldn't work, cuz we marked it as a 'final'

}

data class CustomerEntity(val name: String) : Person() {

}

fun main() {
    val customer = Customer()
    customer.validate()
    val specialCustomer = SpecialCustomer()
}