package generics

import java.io.Serializable

/* We can declare generic type with name whatever we want, and it doesn't have to be called a 'T'
*'T' Generic can be any type, includes 'null'
* to declare a non-nullable generic type, we use 'Any' as a type and without a '?'
* we can constraint 'limit, restrict' the type of 'T' if we declare its type is a specific class
* anything that inherits from that specific class, it's considered of type 'T'
* if we want to restrict 'T' to more than one type, we can do so by using the 'where' Keyword
* we can use type parameters with functions and restrict them too
 */

open class Entity(val id: Int)

// declaring 'T' as of type 'Entity', anything that inherits from 'Entity' considered T
class Repository<T : Entity> {
    fun save(entity: T) {
        if (entity.id != 0) {
            // code...
        }
    }
}


fun main() {
    val repo = Repository<CustomerEntity>()
}

// Considered as of 'T' type // cuz it inherits the 'Entity' class
class CustomerEntity(id: Int) : Entity(id)

// Not considered as of type 'T' type // cuz it doesn't inherits the 'Entity' class
class DataEntity(id: Int)

// Applying more restriction on 'T' Generic by using 'where' keyword
// Also declaring different generic name
class Repository2<myType> where myType : Entity, myType : Serializable

// declaring a function which takes an 'obj' of type 'T'
fun <T> streamObject(obj: T) {}

// Restrict the type
fun <M : Entity> streamObject2(obj: M) = Unit

// Here 'type' could be anything except null, if we add '?' to 'Any' then it considers 'null' too
fun <type : Any> streamObject3(obj: type) {

}
