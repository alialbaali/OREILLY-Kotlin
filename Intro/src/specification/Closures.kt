package specification

/*Closure is accessing close values*/

fun outsideFunction() {
    for (number in 1..100) {// here's a variable 'number'
        println(unaryOperation(number) { it * 2 }) // accessing this value
    }
}

fun main() {
    outsideFunction()
}