package functions

/*'inline' modifier copies the code of the 'function with lambda parameter' to where it's called!
* you can check by 'show Byte code and decompile to Java'
* inline modifier are only useful with functions that has lambdas, other wise there's no benefits from it
* basically, calling an inline function, copies the code of that function to where we are calling it
* 'noinline' modifier specify which lambda we want to copy its code and which we don't
* we can't store any reference to an inline function */


fun operation(op: () -> Unit) {

    println("before calling op")
    op()
    println("after calling op")

}

fun main() {
    operation { println("This is the actual op function") }
    anotherOperation({ println("nothing") }, { println("Good") })
}


// as shown below, the function we are calling has a lambda parameter
// and the code for that function is copied below, instead of just invoking it and passing parameters!

// public final class InlineFunctionsKt {
//   public static final void operation(@NotNull Function0 op) {
//      Intrinsics.checkParameterIsNotNull(op, "op");
//      String var1 = "before calling op";
//      boolean var2 = false;
//      System.out.println(var1);
//      op.invoke();
//      var1 = "after calling op";
//      var2 = false;
//      System.out.println(var1);
//   }


// here we are saying that we want to copy the code for 'op2' lambda but not for 'op' lambda
inline fun anotherOperation(noinline op: () -> Unit, op2: () -> Unit) {
    /// code
}

// we can't store any reference to an inline function
//inline fun tyringToInline( op: () -> Unit) {
//    val reference = op // won't compile, cuz we can't assign a reference to an 'inline function'
//    println("assigned value")
//    op()

