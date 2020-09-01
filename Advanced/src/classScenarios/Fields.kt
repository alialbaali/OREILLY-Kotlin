package classScenarios

/* we can use 'field' to reference to the value of the property or attribute
* */

class Customer() {
    var number: Double = 0.0 // attribute
        get() = field * 3.0 // Custom getter
        set(value) {  // Custom setter
            if (value > 100) {
                field = value

            }
        }
}


fun main() {
    val customer = Customer()

    println(customer.number) // prints 3.0
    customer.number = 200.0
    println(customer.number) // prints 200

}