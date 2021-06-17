class A2{
    companion object
    {
        @JvmStatic //We can access (static) from java
        fun show()
        {
            println("Hello")
        }
    }
}

fun main(args: Array<String>) {
    A2.show()
}

//Factory pattern
