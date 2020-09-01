package delegation

/*we can declare an extension property to classes, we have to use a getter for the value*/

// declaring an extension property
val String.hasAmpersan: Boolean
    get() = this.contains("&") // a getter


fun main() {
    println("Hello".hasAmpersan)
    println("Hello & Buy".hasAmpersan)

}