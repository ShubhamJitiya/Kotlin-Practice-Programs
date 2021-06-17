open class Human2(age: Int) {
    init{
        println("In human " + age)
    }
    open fun think()
    {
        println("Real Thinking")
    }
}

class Alien4(age: Int) : Human2(20) //Simiar to C++
{

    init{
        println("In alien")
    }
    override fun think()
    {
        println("Overrided Method")
    }
}

fun main(args : Array<String>) {
//    var mayank = Human2()
    var mayank = Alien4(20)
    mayank.think()
}
//Use a constructor
//We must make methods final - don't let anyone to extend your class
//By default all classes in kotlin are final
//Open keyword - to parent class, to allow inheritance
//Multiple inheritance is not supported in java

//Human2 H = new Alien4(); //In java -> create reference of human and object of alien
//var mayank : Human2 = Alien4()