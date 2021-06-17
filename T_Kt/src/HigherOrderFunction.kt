import java.util.function.Consumer

data class Alien7(var name: String, var points: Int)

fun main(args: Array<String>) {
    var values: List<Int> = listOf<Int>(8,9,4,2)

//    for (i in values)
//    {
//        println(i)
//    }

    var con : Consumer<Int> = object : Consumer<Int>
    {
        override fun accept(t: Int)
        {
            println(t)
        }
    }

    values.forEach(con)

//    values.forEach({println(it) })
//    values.forEach({ n -> println(n) })
//    values.forEach(::println)
//    values.forEach(classname::println)
}
//Functional programming
//pass fn to a fn
//Consumer - interface -> java 1.8