package classScenarios

/* by using 'sealed' modifier on a class,
* we can inherit this class only from within the file itself,
* meaning we can't inherit this class from another file
 */


// we can inherit this class only from within the file
sealed class PageResult(val result: String, var isError: Boolean)

// classes able to inherit the 'sealed' class, cuz there are in the same file
class Error() : PageResult("Error", true)

class Success() : PageResult("Found", false)

// classes can't inherit from the 'sealed' class, cuz there are not in the same file

// Check NestedClass File