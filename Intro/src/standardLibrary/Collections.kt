package standardLibrary

/*
* 'javaClass' attribute returns the type of the class type when using it on variables*/

fun main() {

    // Immutable lists

    val numbers = 1..100 // creating list of numbers using kotlin collections

    val cities: List<String> = listOf("Madrid", "London", "Paris") // creating immutable list of strings

    val emptyList = emptyList<String>()

    println(cities.javaClass) // returns the type of the class

    println(emptyList.javaClass) // returns 'EmptyList' class type


    // Mutable lists

    val mutableCities = mutableListOf<String>("Madrid", "London", "Paris")// creating immutable list
    mutableCities.add("Rome") // adding an element to a mutable list

    // Using different kotlin lists' structures
    val hashMap =
        hashMapOf<String, String>(Pair("Madrid", "Spain")) // creating 'hashMap' with no need to specify the type
    val linked = linkedSetOf<String>()
    val hashSetOf = hashSetOf<String>()
    val setOf = setOf<String>()
    val booleans = booleanArrayOf(true, false, true)
    val characters = charArrayOf('a', 'b', 'c')
    val characters2 = 'a'..'z'
    // ... and more


}
