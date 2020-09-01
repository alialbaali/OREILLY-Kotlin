package Classes

/*
* Using 'data' modifier cuts boilerplate code by creating 'toString' , 'equals' , 'hashcode' methods
* without needing to code every one of them. using 'data' already creates these methods. Cool ha?
* You still can override them */
data class Item(var id: Int, var price: Double, var color: String)

fun main() {

    val item = Item(1, 10.29, "Black")
    var item2 = Item(2, 45.34, "Red")
    val item3 = Item(1, 10.29, "Black")

    println(item) // printing item using 'toString' method which created by 'data' modifier

    if (item == item3) println("they are equal") else println("they are not equal") // checking the equality using 'equal' which created bu 'data' modifier
    if (item == item2) println("they are not equal") else println("they are not equal")

    val item4 = item2.copy() // copying the attributes to another instance using the copy method
    println(item4)

    val item5 = item3.copy(id = 10) // modifying the copied attributes

    item2 = item // copying the attributes without a method
    println(item2)
}

