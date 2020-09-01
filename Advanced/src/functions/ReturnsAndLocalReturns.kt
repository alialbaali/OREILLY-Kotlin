package functions

/* calling 'return' in a forEach loop, it will call 'return' of the function
* meaning, any code won't be executed after the return.
* if we want to call 'return' of the forEach loop and not the function, we have to specify specifically by labels
* labels are like variables assigned to different pieces in code (i.e. functions, lambdas)
* local returns are only allowed to be called from 'inline' functions
* in case if we pass an anonymous function, then 'return' of the closest function would be called
* meaning we don't need labels to call the local return like we have with lambdas*/

fun containingFunction() {
    val numbers = 1..100
    numbers.forEach {
        // this forEach function is 'inline', so we can have a local return
        // if this function 'forEach' isn't 'inline' then, we can't HAVE a local return
        if (it % 5 == 0) {
            // local return
            return // this is calling 'return' of the function and the forEach loop
        }
    }
    println("Hello!") // meaning that line won't be printed cuz after it's after 'return' of the function
}


fun containingFunction2() {
    val numbers = 1..100
    numbers.forEach labelTest@{
        if (it % 5 == 0) {
//            return@forEach // this is calling 'return' of the forEach loop by using default label
            return@labelTest // here we are specifying which piece of code we need to return by using modified labels
        }
    }
    println("Hello!") // meaning that line will be printed
}


fun containingFunction3() {
    val numbers = 1..100
    numbers.forEach(fun(element) { // anonymous function
        if (element % 5 == 0) {
            return // local return of the anonymous function and not the main function 'containingFunction3'
        }
    })
    println("Hello!")
}
