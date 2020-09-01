package generics

import classScenarios.Customer

/*using the 'out' modifier, we can specify the type as a covariance*/

// using 'out' modifier
interface ReadOnlyRepo<out T> {
    fun getId(id: Int): T
    fun getAll(): List<T>
}


class ReadOnlyRepoImpl<out T> : ReadOnlyRepo<T> {
    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getId(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main() {
    val ro = ReadOnlyRepoImpl<Customer>()

    ro.getAll()
}