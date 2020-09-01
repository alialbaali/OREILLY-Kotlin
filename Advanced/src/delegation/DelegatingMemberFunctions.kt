package delegation

import classScenarios.Customer

/*Delegation concept is, instead of inheriting classes,
 *we can pass an instance of the class we want to inherit as an attribute of the child class
 *first-class delegation concept, is passing only a value without declaring it as a property
 * since, it's not a property, we don't have access to it,
 * but by using delegation, we have access to its functions
 * we can make many delegations for a single class, but be aware it might be unreadable */

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>

}

// passing the 'Repository' class instead of inheriting it
class Controller(private val repository: Repository) {

    // Delegation
    fun index(): String {
        return repository.getAll().toString()
    }

}


// Kotlin takes it further by first-class Delegation
// 'repository' is not property here, so we can't refer to it
// but instead we can refer to its functions

class FirstClassController(repository: Repository) :
    Repository by repository { // here we are saying 'delegate the function of the 'Repository' to the instance passed in 'repository'!

    fun index(): String {
        // calling 'repository' functions
        return getAll().toString()
    }
}


interface Logger {
    fun logAll()
}

// passing too many dependencies, could make the code unreadable
class Controller2(repository: Repository, logger: Logger) : Repository by repository, Logger by logger {

    fun index(): String {
        return logAll().toString()
    }
}

