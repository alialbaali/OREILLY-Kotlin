package classScenarios

/*(Unlike Java) There are no static functions or attributes in kotlin
* we can use a 'companion object' as replacement for static code
* companion object is like a static object that has static functions and attributes
* Only 1 Companion object is allowed per class
* to call a static function (written in kotlin) from java code, we have to annotate it by 'JvmStatic'
* there's no need to annotate anything unless we want to call it from java code
* companion objects can have extension properties*/

class Log() {

    // declaration of a companion object
    companion object Factory {
        // a companion function or a static function

        // this is how we call a function without 'JvmStatic' annotation from java
        // Log log = Log.Factory.createFileLog
        fun createFileLog(fileName: String): Log = Log(fileName)

        // this function can be called as static from java
        // this is how we call the 'JvmStatic' annotated function from java
        // Log log = Log.usedByJavaCode()
        @JvmStatic
        fun usedByJavaCode() {
        }

    }

    // defining an extension property to a companion object
    val Factory.hasValue: Boolean
        get() = true


    constructor(fileName: String) : this() {

    }

    // we can access the function of the object 'Factory' in our class
    fun usingFactoryFunction() {
        Factory.createFileLog("AAA")
    }


}


fun main() {
    // we can access the function like that // without companion modifier
    val log = Log.Factory.createFileLog("FileName.txt")

    // or we can access the function like that // with companion modifier
    val log2 = Log.createFileLog("FileName.txt")

}
