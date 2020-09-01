package tidbits

import Classes.Item


/* Pair is a type that can hold two values in a single variable.
* it has 'first' and 'second' attributes to access these values
* pairs can also be declared using 'to' ex/ "paris" to "france"
* Triple is a type that can hold three values in a single variable
* it also has 'first', 'second' and 'third' attributes to access these values */
fun capitalAndPopulation(country: String): Pair<String, Long> { // returning type is a 'Pair'
    return Pair("Madrid", 2300000)
}

fun countryInfo(country: String): Triple<String, String, Long> { // returning type is a 'Triple'
    return Triple("Madrid", "Europe", 230000)
}

fun main() {
    // Using tuples
    val result = capitalAndPopulation("Madrid") // returning a 'Pair' to the variable

    println(result.first) // printing the first value in the 'Pair'
    println(result.second) // printing the second value in the 'Pair'

    val countryInfo = countryInfo("Madrid")

    println(countryInfo.first) // printing the first value in the 'Triple'
    println(countryInfo.second) // printing the second value in the 'Triple
    println(countryInfo.third) // printing the third value in the 'Triple


    // Deconstructing Values
/* Deconstructing values is declaring variables that can hold values at one time
* */
    val (capital, population) = capitalAndPopulation("Madrid") // the returned values are assigned to 'capital', 'population'

    println(capital)
    println(population)

    val (capital2, popluation2, region) = countryInfo("Madrid") // the returned values are assigned to the variables

    println(capital)
    println(popluation2)
    println(region)

    // initializing an instance and assigning its values to variables
    val (id, price, color) = Item(10, 23.34, "Black")

    // declaring a list that holds pairs
    val listCapitalsAndCountries = listOf(Pair("Madrid", "Spain"), "Paris" to "France")

    // Using deconstructing values in for loops
    for ((capital3, country) in listCapitalsAndCountries) {
        println("$capital3, $country")


    }


}


