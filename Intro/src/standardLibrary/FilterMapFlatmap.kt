package standardLibrary

/*'forEach' extension function can be called on lists, which loops over the functions by taking a lambda
* 'filter' filters and returns list of elements satisfy a certain condition
* 'map' returns a list with elements based on a condition
* 'it' in lists refers to the actual instance in the list
* 'flatMap' TODO */

data class Album(
    val title: String,
    val years: Int,
    val chartUK: Int,
    val chartUS: Int,
    var tracks: List<Track> = listOf()
)

data class Track(val title: String, val durationInSeconds: Int)

val albums =
    listOf(
        Album(
            "The Dark Side of the Moon", 1973, 2, 1,
            listOf(
                Track("Speak to Me", 90),
                Track("Breathe", 163),
                Track("On he Run", 215),
                Track("Time", 421),
                Track("The Great Git in the Sky", 276),
                Track("Money", 382),
                Track("Us and Them", 462),
                Track("Any Color You Like", 205),
                Track("Brain Damage", 228),
                Track("Eclipse", 123)
            )
        ),
        Album("The Wall", 1979, 3, 1),
        Album("Wish You Were Here", 1975, 1, 1),
        Album("Animals", 1977, 2, 3),
        Album("The Piper at the Gates of Dawn", 1967, 6, 131),
        Album("The Final Cut", 1983, 1, 6),
        Album("Meddle", 1971, 3, 70),
        Album("Atom Heart Mother", 1970, 1, 55),
        Album("Umnagumna", 1969, 5, 74),
        Album("A Sauceful of Secrets", 1968, 9, 0),
        Album("More", 1969, 9, 153)
    )

// map : [a, b, c] f(x) -> [f(a), f(b), f(c)]
// flatMap : {[a,b], [c,d]} f(x) -> {f(a), f(b), f(c), f(d)]
// TODO
fun albumAndTrackLowerThanXSeconds(durationInSeconds: Int, albums: List<Album>): List<Pair<String, String>> {
    return albums.flatMap {
        val albumTitle = it.title
        it.tracks.filter {
            it.durationInSeconds < durationInSeconds
        }.map {
            Pair(albumTitle, it.title)
        }
    }
}

fun main() {

    // Using 'forEach' function to loop over the elements of the list 'albums'
    albums.forEach {
        // checkout the 'forEach' function in the class
        // takes a lambda {instance ->  code} // using 'it' since there's only one parameter only
        if (it.chartUK == 1) println("Found it - ${it.title}") // 'it' refers to the album instance in the list
    }

    // we can do it either ways
    val filteredAlbums =
        albums.filter { it.chartUK == 1 } // takes a condition, and returns a list of the value satisfy that condition!

    filteredAlbums.forEach { println("Found it - ${it.title}") } // using 'forEach' loop to print the elements, using 'it' to refer to the instance!

    // OR

    albums.filter { it.chartUK == 1 }.forEach { println("Found it - ${it.title}") }

    albums.first() // returns the first element in the initial list
    albums.first { it.chartUK == 1 } // returns the first element in the filteredList that satisfy the condition!

    val titles = albums.filter { it.chartUK == 1 }.map { it.title } // 'map' returns a list with filtered song titles!
    titles.forEach { println(it) } // prints the titles

    // both do the same thing
    albums.filter { it.chartUK == 1 }.map { it }.forEach { println(it) }
    albums.filter { it.chartUK == 1 }.forEach { println(it) }


    val pair = albums.filter { it.chartUK == 1 }.map { Pair(it.title, it.years) } // returns a pair list

    pair.forEach { println(it) } // prints the list


    albumAndTrackLowerThanXSeconds(200, albums).forEach { println(it.first) }
}



