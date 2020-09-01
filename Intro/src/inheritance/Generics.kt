package inheritance

/* we use generics to implement one interface with one default implementation with different types
* instead of creating many interfaces with same implementation and different types as below
* generic types can be named anything like 'Entity', they don't need to be specifically named 'T' or 'E'.
**/

// Not using Generics
interface CustomerRepository2 {
    fun store() {
        // implementation
    }

    fun getById(obj: Customer)
}

interface EmployerRepository2 {
    fun store() {
        // implementation
    }

    fun getById(obj: Employee)
}


// Using Generics

interface Repository<T> { // an interface with 'type' generic, we can use it for different types such as 'Employee' and 'Customer' when we create instances!
    fun getById(id: Int): T
    fun getAll(): List<T>
}

class CustomerGenericRepository<T> : Repository<T> {
    override fun getById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class GenericRepository<T> : Repository<T> {
    override fun getById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

// if we want to have same generic type, we use a class for it cuz it doesn't makes sense using it just with functions
// but if we want to have different generic types, we use them with functions and not with the class!

interface Repo {
    fun <T> getById(id: Int): T // '<T>' is saying this function takes type parameter and returns it
    fun <E> getAll(): List<E>
}

class myRepo : Repo { // moving the type from the class type to its functions
    override fun <T> getById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <E> getAll(): List<E> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}


fun main() {
    val customerRepo =
        CustomerGenericRepository<Customer>() // creating an instance by using generics and specifying the type.
    val customer = customerRepo.getById(10)
    val customers = customerRepo.getAll();
}