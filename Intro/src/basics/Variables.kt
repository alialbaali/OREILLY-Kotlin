package basics

fun main() {


    // var -> variable can be changed (Mutable)
    var streetNumber: Int
    var streetName: String = "High Street"

    // streetNumber = "24" won't work cuz it's a different type (Int)

    // we don't need to specify the type!
    var streetName2 = "High Street 2 "

    // val -> variable can't be changed (Immutable)
    val zip = "10010"

//    zip = "10010" won't compile cuz it's (val) and not (var)
    // Different types
    val byte: Byte
    val float: Float
    val int: Int
    val double: Double
    val char: Char
    val string: String
    val long: Long

    // We can specify some types (default is Int)

    val myLong = 10L // using (L) to specifically making it a long type
    val myFloat = 100F // same
    val myHex = 0x0F
    val myBinary = 0xb01

    val myInt = 100
    /* there's no implicit conversion
    val myLong2 : Long = myInt  */
    // Instead we could use explicit conversion
    val myLong3: Long = myInt.toLong()

    val myChar = 'A'
    val myString = "My String \n " // adding a new line using (/n)

    // Triple quotes for multiple lines

    val mutlipileLineTripleQuotes = """line 1 
        |line 2
        |line 3
        |line 4
    """.trimMargin()

    // String concatenation
    val years = 10
    val message = "A decade is $years"


    val name = "Mary "
    val length = "Length of name is ${name.length} "




}