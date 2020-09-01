fun main() {

    nameCheck("10")

    isEven(10)
    testLambdas(20)

    testLambdas2({
        isEven(it).toString()
    }, {
        it.toInt()
    })
    println(invokeLambda { it % 2.0 == 0.0 })
}

val nameCheck = { name: String ->
    name.startsWith("100")
}

val isEven = { number: Int ->
    number % 2 == 0
}

val testLambdas: (Int) -> String = { number: Int -> number.toString() }
val testLambdas2: ((Int) -> String, (String) -> Int) -> String = { firstLambda, secondLambda ->
    firstLambda(secondLambda("10"))
}

fun invokeLambda(lambda: (Double) -> Boolean): Boolean {
    return lambda(4.329)
}