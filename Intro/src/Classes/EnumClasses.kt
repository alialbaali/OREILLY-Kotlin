package Classes

// BTW the class name doesn't have to be the same as the file name.
enum class Priority(val value: Int) { // enum class
    // Instances of the class
    // we could also specify a value for each instance by declaring an attribute to the class
    // then pass the attribute value we want to the instances
    MINOR(-1) {
        override fun value(value: Int) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    NORMAL(0) {
        override fun value(value: Int) {
            NORMAL.value(value * 3) //To change body of created functions use File | Settings | File Templates.
        }
    },
    MAJOR(1) {
        override fun value(value: Int) {
            MAJOR.value(value * 2) //To change body of created functions use File | Settings | File Templates.
        }
    },
    CRITICAL(10) {
        override fun value(value: Int) {
            CRITICAL.value(value * 1) //To change body of created functions use File | Settings | File Templates.
        }

        override fun toString(): String {
            return "MINOR PRIORITY" // overrides the return value when printing the instance!
        }
    }; // adding a 'semi-colon' to separate it ('semi-colon' is a MUST here)

    fun text(text: String) {
        println("nothing")
    }

    abstract fun value(value: Int) // when creating 'abstract' function we need to implement this function in each instance we have

}

fun main() {

    val priority = Priority.NORMAL
    val majorPriority = Priority.MAJOR
    println(priority) // prints the instance using 'toString'
    println(majorPriority.value) // prints the value of the instance
    println(priority.ordinal) // prints the order of the instance
    println(majorPriority.name) // prints the name of the instance

    for (priorityInList in Priority.values()) { // 'values' function gives us all the instances of the enum class
        println(priorityInList) // prints all the values in the enum class
    }
    val minorPriority = Priority.valueOf("MINOR") // accessing the instance by name

    val criticalPriority = Priority.CRITICAL
    println(criticalPriority)


}