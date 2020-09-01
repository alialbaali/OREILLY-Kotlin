package basics

fun main() {

    var myString = "Not Empty "
    // if is an expression, which means we assign if condition to a value

    val myResult = if (myString != "") { // type Unit (like void)
        println("not empty")
    } else {
        println("is empty")
    }


    val result = if (myString != "") 1 else 0 // always need an else block if the first expression is not true

    var string = if (myString != "") {
        "empty"
    } else {
        "not empty"
    }


    when (string) {
        "empty" -> println("empty")
        "not empty" -> println("not empty")
        else -> println("Unknown")

    }

    when (result) { // you don't need a "break" statment, it already break the conditonal when it finds a match
        is Int -> println("it's Int")
//        is String -> println("It's string") won't compile cuz "result" is (Int)

    }


    // when is an expression which can be assigned to a variable
    var whenStatment = when (string) {
        "Empty " -> "Empty"
        else -> "not empty"
    }

    

}
