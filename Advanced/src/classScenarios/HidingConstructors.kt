package classScenarios

/* To prevent initializing a class, we can set the constructor as private */

class Password private constructor()


fun main() {
    // by using 'private constructor' we can prevent any initialization of the class
//    val password = Password() // can't be initialized, cuz its constructor is private

}