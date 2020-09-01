package Classes

/*
* objects just like regular class but only has 1 instance of it (Singleton)
* we can define an object with its own functions and attributes
*/

object Global { // 'object' is like creating one instance of a class with attributes and functions
   val PI = 3.14
   fun text() {
       println(PI * 3)
   }

}

fun main() {
   println(Global.PI) // calling 'object' attribute
   println(Global.text()) // calling 'object' function

   val localObject = object { // 'localObject' is like creating 1 instance of class and assigning to a variable
       val PI = 3.14359
   }

   println(localObject.PI) // prints the object attribute 'PI'

}