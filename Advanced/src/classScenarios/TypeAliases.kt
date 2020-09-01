package classScenarios

/*by using 'typealias' we can alias types to our own names*/

typealias Name = String

// Here 'Name' is just an alias of type 'String' , it's not a new type
data class Employee(val name: Name, val email: String) {
    fun printName(string: String) {

    }
}


fun main() {
    // here we are passing String, cuz "Name" is just an alias of String
    val employee = Employee("Ali", "ali@email.com")

    employee.printName("A String")
}