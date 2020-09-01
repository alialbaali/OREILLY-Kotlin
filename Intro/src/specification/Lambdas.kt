package specification

//
///* lambdas' syntax is 'val lambdaName : Type = { argumentList -> codeBody }'
//* */
//
//val times: (Double, Double) -> Double = { x, y -> x * y } // defining a lambda
//
//fun operation2(x: Int, y: Int, op: (Int, Int) -> Int) {
//    op(x, y)
//}
//
fun unaryOperation(x: Int, op: (Int) -> Int): Int = x + op(x)
//val num = 10L
//fun sum2(x: Int, y: Int): Int = x + y
//val op = { x: Int, y: Int -> x.toString() + y.toString() }
//
//val add: (Int, Int) -> Int = { x, y -> x + y }
////val substract: (Double, Double) -> String
//
//
//val functionName: (Int) /* parameter type */ -> String // return type
//        = { x -> x.toString() }
//
//val name2: (String) -> Int = { name ->
//    // lambda
//    if (name.length > 15)
//        1
//    else
//        2
//
//}
//
//fun name(name: String): Int { // normal function
//    if (name.length > 15)
//        return 1
//    else
//        return 2
//}
//
//
//val add2: Long = 10L
//
//
//fun main() {
//    println(name("Name1"))
//    println(name2("Name2adfasdfasdfasdf"))
//    operation(2, 10, { x, y -> x + y }) // passing lambda into the argument
//    operation(2, 10) { x, y -> x + y }  // if the lambda is the last argument, we can take it out of the parenthesis
//    println("${op(10, 12)}, ${sum(10, 12)}")
//    divide(10.0, 5.0) { x, y -> x.toString() + y.toString() }
//    val checkNumber: (Any, Any) -> Boolean = { x, y -> x !is String && y !is String }
//    val checkType = { x: Any, y: Any ->
//        when (x) {
//            is Int -> Int
//            is Double -> Double
//            is Long -> Long
//            is Float -> Float
//            else -> Any()
//        }
//    }
//    divide(firstTerm = 0.0, secondTerm = 0.0)
//    operation3(10, 12, checkNumber, checkType)
//
////    println(unaryOperation(3) {})
//}
//
//
//fun divide(
//    firstTerm: Double,
//    secondTerm: Double,
//    generateString: (Double, Double) -> String = { x, y -> x.times(y).toString() }
//): String {
//    return generateString(firstTerm, secondTerm)
//}
//
//// Testing Lambdas
//
//val operation3: (firstNumber: Any, secondNumber: Any, checkNumber: (Any, Any) -> Boolean, checkType: (Any, Any) -> Any) -> Any =
//    { firstNumber, secondNumber, checkNumber, checkType ->
//        if (checkNumber(firstNumber, secondNumber))
//            when (checkType(firstNumber, secondNumber)){
//            }
//        else
//            false
//    }