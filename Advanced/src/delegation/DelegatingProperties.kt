package delegation

import kotlin.reflect.KProperty

/* we can use delegation for properties too, but when we do
* we have to create two functions in the class we are delegating from
* which they are 'getValue' and 'setValue'
* which they are essentially it's a getter and a setter which has been externalized outside of the class,
* delegated to something else, which we can reuse across multiple properties and across multiple classes
* if the property is 'val' then we don't need to implement the 'setValue' function
* */
class Service {
    var someProperty: String by ExternalFunctionality()
}

class ExternalFunctionality {

    var backingField = "Default"
    operator fun getValue(service: Service, property: KProperty<*>): String {

        println(
            "getValue called with params: \n" +
                    "service: $service\n" +
                    "property: ${property.name}"
        )
        return backingField
    }

    operator fun setValue(service: Service, property: KProperty<*>, value: String) {
        backingField = value
    }


}

fun main() {

    val service = Service()
    println(service.someProperty)
    service.someProperty = "New Value"
    println(service.someProperty)
}
