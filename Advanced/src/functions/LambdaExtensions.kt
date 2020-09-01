package functions

/*TBA*/


class Request(val method: String, val query: String, val contentType: String)
class Response(var contents: String, var status: Status) {
    fun status(status: Status.() -> Unit) {}
}

class Person(val name: String, val surname: String)
class Status(var code: Int, var description: String) {
    fun user(user: Status.() -> Unit) {}
}

class RouteHandler(val request: Request, val response: Response) {
    var executeNext = false
    fun next() {
        executeNext = true
    }

}

fun response(response: Response.() -> Unit) {}

fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f


fun main() {

    routeHandler(path = "/index.html") {
        if (request.query != "") {
            // process
        }

        response {
            status {
                user {
                    status {
                        user {
                            status {

                            }
                        }
                    }
                }
                code = 404
                description = "Not Found"
            }
        }
    }
}