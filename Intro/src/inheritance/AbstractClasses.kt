package inheritance

/*
*'abstract' classes are classes we can't create an instance of them, and could have abstract attributes and functions.
* we use abstract classes to create abstract attributes and functions to have different implementation in different classes.
* Not every function or attribute needs to be abstract, meaning all the inherited classes share the same implementation.
* abstract attributes and functions MUST be inside an abstract class
* we can't have a class inherits from two 'abstract' classes
 */

abstract class StoreEntity {
    // a function needs to be implemented in the inherited classes!
    abstract fun store() // we can have abstract members, which doesn't have implementation,
    abstract var isClosed: Boolean

    open val isActive = true // non-abstract attribute.

    fun status(): String { // not-abstract method
        return isActive.toString()
    }
}


class Employee : StoreEntity() {
    override var isClosed: Boolean = true
    override val isActive = false
    override fun store() {
        // Implementation
    }
}

fun main() {
//    val storeEntity = StoreEntity() wouldn't work, cuz it's abstract!
    val employee = Employee() // we can create an instance of a class inherits the abstract class!
    employee.isActive
    employee.status()

}
