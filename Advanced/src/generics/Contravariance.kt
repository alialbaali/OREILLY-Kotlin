package generics

interface WriteOnlyRepo<in T> {
    fun save(obj: T)
    fun saveAll(list: List<T>)
}