abstract class Human3() {
    abstract fun think()

    fun talk()
    {
        println("Talking ...")
    }
}
class Doctor :  Human3()
{
    override fun think()
    {
        println("Critical thinking")
    }
}

class Alien5() : Human3()
{
    override fun think()
    {
        println("Virtual thinking")
    }
}

fun main(args : Array<String>) {
    var mayank = Alien5()
    mayank.talk()
    mayank.think()
}