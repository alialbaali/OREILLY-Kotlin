package classScenarios

/* we can nest classed in kotlin
* by using 'private' modifier on the nested class, we can prevent any access to the nested class
*  by default we can't access attributes and functions of the main class in the nested class
* by using 'inner' modifier on the nested class, let's us access the attributes and functions of the main class
* using 'inner' modifier affects the way we create instance of the nested classes*/


class DirectoryExplorer(var data: String) {

    // regular nested class
    class PermissionCheck {
        fun validatePermission(user: String) {

//            data = "value" // we can't access the main class stuff
        }
    }


    // using 'inner modifier'
inner class AccessValues() {

        fun manageData() {
//            by using the 'inner' modifier on the nested class
            data = "new Value" // we are able to access the main class attribute
            listFolder("My Folder", "Ali") // same with functions
        }

    }

    fun listFolder(folder: String, user: String) {

        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission(user)

    }


    // private nested class (unreachable Class)
    private class NestedClass() {

    }

}


fun main() {

    // Create an instance of the main class
    val de = DirectoryExplorer("Data")

    // Create an instance of the nested class
    val pc = DirectoryExplorer.PermissionCheck() // the nested class isn't considered as a part of the main class

//    val av = DirectoryExplorer.AccessValues() // we can't since the 'inner' nested class is considered as a part of the main class

    // So to create an instance of the 'inner' nested class
    val am = DirectoryExplorer("Data").AccessValues() // we have to do it like that

    // can't access it, cuz it's private
//    val ns = DirectoryExplorer.NestedClass()
}


// Sealed Classes

// we can't inherit from that 'sealed' class, cuz it's declared on a different file
//class MediumSuccess : PageResult()