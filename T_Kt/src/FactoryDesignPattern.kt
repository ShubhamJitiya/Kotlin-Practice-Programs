class A3 {
    companion object {
        fun create(): A3 = A3()
    }

    fun show() {
        println("in show")
    }
}

fun main(args: Array<String>) {
    var obj = A3.create()
    obj.show()
}