package tidbits

/*Base class for Exceptions is 'Throwable'
* to handle an Exception we 'try' and 'catch' Block or 'try' and 'finally' or 'try' and 'catch' and 'finally'
* we can have many 'catch' Blocks (catching many exceptions)
* Exceptions can have a message (to explain why the Exception is thrown), can be access thru 'e.message'
* try contains the code we want to try
* catch captures the Exception as a parameter
* finally runs the block even even if there's an Exception
* try block is an Expression, which means we can assign it to a value'*/

// To create an Exception, We must inherit 'Throwable' class

class NotANumberException : Throwable() { // Creating an Exception
// Exception without a message
}

class NotAStringException(message: String) : Throwable(message) {
// Exception with a message, passing the message to the 'Throwable' class

}

fun checkIsString(obj: Any) {
    when (obj) {
        !is String -> throw NotAStringException("It's not a String") // passing the message as an argument

    }
}

fun checkIsNumber(obj: Any) {
    when (obj) {
        // checking types in one line
        !is Int, Long, Float, Double -> throw NotANumberException() // throwing an Exception
    }
}

fun main() {
    // Without catching the Exception
    checkIsNumber('A')

    // With catching the exception
    try {
        checkIsNumber('A') // trying the method that might throw an Exception
    } catch (e: NotANumberException) { // capturing the Exception -
        println("It's not a number") // here, we are explicitly typing the message when the exception is thrown
    } catch (e: IllegalArgumentException) { // another catch Block
        println("Do Nothing")
    }

    val result = try { // assigning the returned value to the variable
        checkIsString(1)
    } catch (e: NotAStringException) {
        println(e.message) // here, we are calling the message we passed in the method
        -1 // this value would be assigned to the variable 'result'
    } finally { // whatever happens, runs the code below
        println("This is a test")
        -2 // this value wouldn't be assigned cuz we already assigned a value using the exception
    }

    checkIsString(1)

    throw NotANumberException() // throwing the exception
    throw NotAStringException("an exception") // not reachable, because we already threw another one


}
