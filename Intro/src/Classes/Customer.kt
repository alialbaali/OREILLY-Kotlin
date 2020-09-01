import java.util.*

// constructor
class Customer(
    var surname: String = "", // you can specify default value like functions
    val yearOfBirth: Int,
    emailAddress: String // declaring only a variable but not as a property (when removing 'val' or 'var'),,
) { // we can declare the properties in the class constructor which is '()'.
    // Plus no need to specify a value, cuz we'll provide the value when we initialize it


    init { // modified constructor for managing the attributes
        surname = surname.toUpperCase() // assigning the value

    }

    // creating another constructor with different parameters, but it MUST call the PRIMARY CONSTRUCTOR and pass its values
    constructor(mobilePhone: String) : this(
        surname = "",
        emailAddress = "email",
        yearOfBirth = 13
    ) // 'this' is the PRIMARY constructor {


    var id = 0 // declaring a property (attribute)
    var name: String = ""
//    var surname: String // wouldn't work, we need to initialize it


    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth // customer getter


    var socialSecurityNumber: String = ""
        set(value) { // custom setter
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social Security number should start with SN")
            }
            field =
                value // setting the value to the variable using 'field' which references to the actual value of the variable
        }


    // functions in classes

    fun customerAsString() { // Member function
        println("Id $id, name $name, surname $surname")
    }


    /* 4 Visibility Modifiers
        * public - DEFAULT and anywhere accessible

    * Top level declarations
        * private - Available inside file containing declaration
        * Internal - Anywhere in the same Module

    * Classes
        * private - ONLY Available to class members
        * protected - Same as private and subclasses
        * internal - Any client inside the module

     */


}


fun main() {

    val customer = Customer("Albaali", 10, "") // declaring a new object (without 'new' keyword)
    customer.id = 10
    customer.name = "Ali"
//    customer.emailAddress wouldn't compile cuz 'emailAddress' is a just a value and not a property

    val customer2 = Customer(
        emailAddress = "",
        yearOfBirth = 10
    ) // altho 'emailAddress' is not a property, you need to a value for it

    print(customer2.age)
    customer2.socialSecurityNumber = "SM"
    customer2.id = 13

    customer.customerAsString()

}
