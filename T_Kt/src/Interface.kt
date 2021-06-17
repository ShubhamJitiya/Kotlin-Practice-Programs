interface A
{
    fun show()
    fun abc()
    {
        println("in abc A")
    }
}
interface B
{
    fun display()
    fun abc()
    {
        println("in abc B")
    }
}
class C : A, B
{
    override fun show()
    {
        println("In show")
    }
    override fun display()
    {
        println("In Display")
    }
//    override fun abc()
//    {
//        println("in abc C")
//    }

    //Specific
    override fun abc()
    {
        super <A>.abc()
    }

}
fun main() {
    var obj = C()
    obj.show()
    obj.display()
    obj.abc()

}
//By default all methods are abstract
//We don't use any keyword
//Must use override
//Can can also define methods in kotlin - as after java 8 we can
    //Ambiguity problem: if we create two methods with same signature in base class
        //Solution: Override in concrete class
    //How to call specific? super