class Human(var n: String) {
    var age : Int = 0
    var name: String = n

    //compulsory call primary constructor
    constructor(age : Int, name : String) : this(name) //Constructor chaining
    {
        this.age = age
    }
    //    perform some operation
//    init {
//        name = n
//        println("Human is Here...")
//    }

    fun think() {
        println("Kotlin is awesome ... $name : $age")
    }
}

//if we have modifier then keyword constructor is compulsory
//class Human public constructor(var n : String)

fun main() {
    var navin = Human(20, "Navin")
    navin.think()
}