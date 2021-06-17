data class Laptop(val brand : String, val price : Int) {
    fun show()
    {
        println("Awesome machine....")
    }
}

fun main() {
    var lap1 = Laptop("Dell", 2000)
    var lap2 = Laptop("Dell", 2000)
    println(lap1==lap2)
    println(lap1.equals(lap2))

//    var lap3 = lap1.copy()
    var lap3 = lap1.copy(price=25000)
    println(lap3) //toString
}

//When we try to print reference
//    It will just print hashcode with class name
//    toString in java

//- data class
//1. Every class needs a toString
//2. override equals & hash Code
//3. Copy