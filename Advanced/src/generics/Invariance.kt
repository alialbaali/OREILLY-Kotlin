package generics

/*when we have a subclass and a superclass, we can't pass an array of the subclass to a function which takes an array of the superclass
* because although, that subclass extends the superclass, the array of the subclass doesn't extend the array of the superclass
* arrays are mutable, which means we can modify them, on the other hand, lists are immutable
* which means we can pass a list of the subtype to a function that takes a list of supertype
* cause we know we can't modify the list */


 open class Person

class Employee : Person()

// function takes an instance of type 'Person'
fun operate(person: Person) = 0

// function that takes an array of type 'Person'
fun arrayOperate(array: Array<Person>) = 0

// function that takes a list of type 'Person'
fun listOperate(list: List<Person>) = 0

fun main() {

    // passing class type 'Person' is okay
    operate(Person())
    // passing class type 'Employee' is okay
    operate(Employee())


    // passing list of type 'Person' is okay
    listOperate(listOf<Person>())
    // passing list of type 'Employee' is okay
    // because the list is immutable, so we can't add elements to it
    listOperate(listOf<Employee>())

    // passing array of type 'Person' is okay
    arrayOperate(arrayOf<Person>())

    // passing list of type 'Employee' is not okay
    // because the 'arrayOf<Employee>()' it's not a type of 'arrayOf<Person>()'
    // since the array is mutable, which means we are gonna have
    // an array of type 'Person' and 'Employee', which is not something we want to do
//    arrayOperate(arrayOf<Employee>())
}

