@file:JvmName("First")
fun main(args : Array<String>)
{
//    add(4,5)
    var result = add(8,7)
    var result2 = max(8,7)
    println(result)
    print(result2)
}
//How to define fn
//fun add(a : Int, b : Int)
//{
//    println(a+b)
//}

//return something
//fun add(a : Int, b : Int) : Int
//{
//    return a+b
//}

//Inline function
fun add(a : Int, b : Int) : Int = a+b

//fun max(a : Int, b : Int) : Int
//{
//    if(a>b)
//        return a
//    else
//        return b
//}
//write in one line
fun max(a : Int, b : Int) : Int = if(a>b) a else b
//--------------------------------------------------
//Function calling from java

//How to call from java code ?
    //In java we must have class

//two ways
//        static - class name
//        non static - object

//create object of kotlin file - it is class file Demo->out->production
    //we can access by class name which is file name
    //we can change kt file name (FunctionalExpressionKt - @file:JvmName("First")

