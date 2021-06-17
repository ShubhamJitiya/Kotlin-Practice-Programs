data class Alien6(var name: String, var points: Int)

fun main(args: Array<String>) {
    var values = listOf<Alien6>(Alien6("Navin", 70), Alien6("Shweta", 80))
//    var values: List<Alien6> = listOf<Alien6>(Alien6("Navin", 70), Alien6("Shweta", 80))

    for (i in values)
    {
        println(i)
    }
}

