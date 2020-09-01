package nulls


/*
* types by default are not null
* we can declare variables are nullable by using '?', we are saying that this variable can hold a 'null' value
* when we call a nullable value, we have to insert 1 of two operations
* "elvis operator '?'" checks for nullability, if it's not null, then return it, if it is null, then don't
* "double examination mark '!!'"  it's okay to return NullPointerException, just let me dow what i want
*
*/
class Service {
    fun evalute() {

    }
}

class ServiceProvider {
    fun createServices() : Service? { // 'Service' instance could be null
        return Service()
    }

}
fun main() {
    val message = null // setting a variable to 'null'

//    val message2 : String = null // wouldn't work, cuz we specified the type is 'String'
    val noMessage : String? // now, this variable can hold null value using '?' !

//    println(noMessage.length) wouldn't work, cuz we didn't initialize it

    noMessage = "Message"
    println(noMessage.length) // now it's initialized

    val name: String? = null

    println(name?.length) // using the 'elvis operator ?', if the value isn't null, return the length, if it is, DON'T

    val sp = ServiceProvider()

    sp.createServices()?.evalute() // '?' checks if the return value 'null' or not

    createServiceProvider()?.createServices()?.evalute() // we have to check for every nullable type

}
fun createServiceProvider(): ServiceProvider? {
    return ServiceProvider()
}
