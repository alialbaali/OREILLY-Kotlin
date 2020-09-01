package delegation

import kotlin.properties.Delegates

/* we can use kotlin built-in delegates, check the 'Delegates' class
* observable delegate observe the property's the old and new values, the lambda call only work after we change the value
* vetoable delegate is like a custom setter and based on a condition, if satisfies, them the value changes
* */

class Observe {
    // setting department value to 'Engineer'
    // when we change it, it prints the old and the new value, so that we know we changed it
    var department: String by Delegates.observable("Engineer") { property, oldValue, newValue ->
        println("Property: ${property.name} has changed from $oldValue to $newValue")
    }
    // setting department2 value to 'Engineer'
    // we can change the value based on a condition we need to satisfy
    var department2: String by Delegates.vetoable("Engineer") { property, oldValue, newValue ->
        newValue.startsWith("M")
    }
}

class Veto {
    var value: String by Delegates.vetoable("String") { property, oldValue, newValue -> newValue.startsWith("S") }

}

fun main() {

    val observe = Observe()
    observe.department = "IT"

    println(observe.department2)
    observe.department2 = "Mechanical"
    println(observe.department2)

    val veto = Veto()

    println(veto.value)
    veto.value = "London"
    println(veto.value)
    veto.value = "Spain"
    println(veto.value)
}
