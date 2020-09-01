package classScenarios

/* 'lateinit' keyword, meaning we can declare a non-null property and initialize it at another time
* but if we don't initialize it at some point, then we get an Exception
* So we MUST initialize it later */

interface Repository {
    fun getAll(): List<Customer>
}

class CustomerController() {
    lateinit var repository: Repository // this attribute isn't initialized (nor Null either) right now
    // so we must initialize it somewhere at some point

    fun index(): String {
        return repository.getAll().toString()
    }
}

fun main() {

    val customerController = CustomerController()
    customerController.index()
}