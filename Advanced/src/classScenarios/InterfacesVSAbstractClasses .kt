package classScenarios

abstract class MyAbstractClass() {
    abstract val name: String

    abstract fun getName()

    val password: String = "null"

    fun getPassword() {
        // code
    }

}

interface MyInterface {
    abstract val name: String

    val surname: String
        get() = "Albaali"

    abstract fun getName()

    abstract val password: String

    fun getPassword() {
        // code
    }
}