package standardLibrary

import java.io.File

/* 'with()' takes a variable, and we can operate on this variable by calling functions by using 'is' */

fun main() {
//    "A message". lots of extensions
    val file = File("filename.txt")

    // using 'with()'
    with(file) {
        // check the with() function's class, to see the others, 'let', 'apply' ...
        isAbsolute
        isDirectory
        isFile
    }


    val string: String? = "some Value"

    // 'let' checks if the string isn't null, then do the code
    string?.let {
        it.length
    }


}