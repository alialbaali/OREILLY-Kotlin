package functions

/*TBA*/

class Manager {
    operator fun invoke(value: String) {
        println(value)
    }

}

fun main() {
    val manager = Manager()
    manager.invoke("something")
    manager("something")
}

