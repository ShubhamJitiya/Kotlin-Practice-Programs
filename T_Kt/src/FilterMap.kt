data class Alien8(var name: String, var points: Int)

fun main(args: Array<String>) {

    var values = listOf<Int>(4, 8, 3, 9, 2, 1)

//    var evens = values.filter{it%2==0}
//    var doubleValues = evens.map{it*2}

    var results = values
        .filter { it%2 == 0 }
        .map { it+2 }

//    doubleValues.forEach({ println(it)})
    results.forEach({ println(it) })

}