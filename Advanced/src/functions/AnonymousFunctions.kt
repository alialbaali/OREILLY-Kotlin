package functions

/*anonymous function is a function without a name, created with
* syntax -> 'fun(x: parameter) : return Type {return // code}'
* we have to specify the return type in anonymous functions, unlike lambda where we don't
* we can have multiple return points, unlike lambda we can't */

fun op(x: Int, op: (Int) -> Int): Int { // function takes a variable and a lambda
    return op(x)
}

fun main() {
    // these two functions are doing exactly the same thing
    op(3) { it * it } // using lambda expression

    op(2, fun(x): Int { return x * x }) // using anonymous function

    op(2, fun(x): Int {
        if (x > 10)
            return 0
        else
            return x * x
    })
}