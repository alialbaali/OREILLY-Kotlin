package tidbits

/* Kotlin has 'Smart Cast' feature, which casts the objects automatically
* you can cast any variable using 'as' keyword followed by the type you want it to cast to
* 'Safe cast' using the question mark 'as?' which checks if a variable can be casted safely
* if a variable can't be casted safely, we get null if we are using safe cast
* if we are not using safe cast, we get NullPointerException */


open class Person {

}

class Employee : Person() {
    fun vacationDays(days: Int) {
        if (days < 60)
            println("You need more vacation")
    }
}

class Contractor : Person() {

}

fun hasVacations(obj : Person) { // Obj is of type Person
    if (obj is Employee)
        obj.vacationDays(20) // Smart casting to Employee
//    else
//        obj. // we can't call 'vacationDays' function, cuz it's not of type 'Employee'
 }

val input: Any = 10 // variable of type Int

fun main() {
    if (input is String) {
        input.length // smart cast to String
    }

    val str = input as? String // casting 'input' variable to 'String' using Safe Cast 'as?'

    println(str?.length)

}