package basics

fun main() {

    for (a: Int in 1..100) { // Loop from 1 to hundred
        println(a)
    }

    for (a in 1..100) { // No need to specify the type of the variable
        println(a)
    }

    val numbers = 1..100

    for (a in numbers){
        println(a)
    }

    for (a in 100 downTo 1){ // Looping from top to bottom
        println(a)
    }

    for (a in 100..1) { // Looping from top to bottom (same as above method)
        println(a)
    }

    for (a in 100 downTo 1 step 5){ // Looping from top to bottom steps 5 (100, 95, 90, ..)
        print(a)

    }

    val capitals = listOf("London", "Paris", "Rome", "Madrid")
    for (capital in capitals){  // Looping over the list
        println(capital) // printing all the capitals in the list
    }
    var i = 100
    while (i > 0){ // while loop
        i--
    }

    do { // Do While loop
        var x = 10
        x--
    } while (x > 10)

    loop@for (i in 1..100){ // loop statment so u could mention later
        for (j in 1..100){
            if (j % i == 0){
                continue // continuing the loop
                break@loop // breaking the first loop using the statment
            }

        }
    }





}