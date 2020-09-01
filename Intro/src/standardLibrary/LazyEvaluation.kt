package standardLibrary

/* Sequences are lazy
* 'asSequence'   checks each value then add to the sequence and do the rest of the code!, then checks another one and add it and so on
* unlike by default which checks all the values then add them to a list do the rest of the code
* 'take()' function, used as an end point, or 'where to stop' condition.
* 'generateSequence() { }' we can generate a sequence, instead of converting from a list to a sequence
* 'lazy' initializing code in a lazy way, means only when it's called */

fun main() {

    // big list of elements, takes so much time to iterate on it
    val elements = 1..1000000000000

    val output = elements.filter { it < 30 }.map { Pair("Yes", it) } // checking each value in the list

//    output.forEach { println(it) }


    // using 'asSequence', checks each element, adds it to a list, do the code, then start check another one
    val sequenceOutput = elements.asSequence().filter { it < 30 }.map { Pair("Yes", it) }

//    sequenceOutput.forEach { println(it) }


    // using 'take', sets the limit to 30 elements then sums up all the elements before 30
    val sumSequenceOutput = elements.asSequence().take(30).sum()

//    println(sumSequenceOutput)

    // generating a sequence based on some logic
    val numbers = generateSequence(1) { x -> x + 10 }
    println(numbers.take(30).sum())

    // this 'lazyInit' won't be initialized when the code runs from up to down, but only when 'lazyInit' is called
    val lazyInit: Int by lazy { 10 }

}