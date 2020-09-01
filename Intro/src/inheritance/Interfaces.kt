package inheritance

/*
* an interface is like an abstract class which can be inherited from anywhere
* all interface functions and attributes are by default 'abstract' and 'open' and they can have default implementation in them
* we can't have attributes assigned to a value in the interfaces, we can only have the declaration!
* we can have a class implements (inherits) many interfaces we want
* we can override already implemented functions!
* */


interface CustomerRepository {
//    val foo = true would'nt work cuz we can't add a value to an attribute in interfaces

    val isWorking: Boolean // but we can have getters/setters to an attribute
        get() = true

    val number: Int // an attribute without a value
    fun getById(id: Int): Customer
    fun store(obj: Customer) { // Yes. Functions can have body in the interfaces
        // implementation
    }
}

class SQLCustomerRepository : CustomerRepository { // we MUST implement the members of the interface!
    override val number: Int // implementing the attribute
        get() = 0 // using getter method to assign a value to the attribute

    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun store(obj: Customer) {
        super.store(obj) // calling the base implementation
    }

}


interface Interface1 {
    fun funA() {
        println("fun A from interface 1")

    }
}

interface Interface2 {
    fun funA() {
        println("fun A from interface 2")

    }
}


class Class1And2 : Interface1, Interface2 {
    override fun funA() {
//        super.funA() wouldn't work cuz we have the same method in different interfaces, so it gets confused of calling which one!
        println("our own")
    }
}

fun main() {
    val c = Class1And2()
    c.funA() // prints 'our own' cuz we overridden the default implementation

}



