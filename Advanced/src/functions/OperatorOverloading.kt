package functions

/* 'operator' modifier allow us to override operator functions (i.e. plus, minus, div, rem, ...)
* and allow us to call the overridden functions with these operator (i.e. +, - , * , ...)
* we can use the 'operator' modifier with extension functions too
* there are many operator we can override such as (.. , in, += , >= , !a, mod, range, ...)
* Check the photo in the kotlin folder 'O'REILLY' Folder or search for kotlin operator conventions to see the rest*/

data class Time(val hours: Int, val mins: Int) {
    fun minus(time: Time) {
        // code
    }

    // using the operator modifier. we are overriding the 'plus + ' function
    operator fun plus(time: Time): Time {
        val minutes = this.mins.plus(time.mins)
        val hoursInMinutes = minutes.div(60)
        val remainingMinutes = minutes.rem(60)
        val hours = time.hours.plus(hoursInMinutes)
        return Time(hours, remainingMinutes)
    }

}

operator fun StringBuilder.plus(stringBuilder: StringBuilder) {
    stringBuilder.forEach { this.append(it) }
}

fun main() {
    // here we are trying to add hours with hours and min with min
//    val new = Time(10, 40) + Time(3, 20) won't work because we don't have an operator to do that

    val new = Time(10, 40).plus(Time(3, 20)) // we can do that

    // and if we add the 'operator' modifier, we can use an operator instead of calling the 'plus' function
    val new1 = Time(10, 40) + (Time(3, 20)) // function with 'operator' modifier

    // without 'operator' modifier
//    val new2 = Time(10, 40) - (Time(3, 20))

    val sb = StringBuilder()
    for (str in sb) {
        str + "Value" // using the operator overridden extension function
    }


}