interface Human5 {
    fun think()
}

fun main(args: Array<String>) {
    var programmer : Human5 = object : Human5
                            {
                                override fun think()
                                {
                                    println("Think Virtually ....")
                                }
                            } //Only one instance
    programmer.think()
}