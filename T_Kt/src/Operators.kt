import java.util.*
import kotlin.test.assertNotSame
import java.util.TreeMap as TreeMap

fun main(args : Array <String>)
{
    /*
    var num1 : Int = 4 // Capital I
    var num2 : Int = 7
    var result = num1 + num2

    println(num1+num2)
    println(num1-num2)
    println(result)
    println("The addition of num1 and num2 is result")

    //String template - In java concatenation
    println("The addition of ${num1} and ${num2} is ${result}")
    println("The addition of $num1 and $num2 is $result")

    var navin = Alien()
    navin.name = "Telusco"

    //    println("Alien name is : $navin.name") //Prints hashcode
    println("Alien name is : ${navin.name}") //use curly braces when we have objects or properties
     */

    /*
//If else Expression
    var num1 : Int = 4
    var num2 : Int = 7

    var result : Int = 0

    if(num1>num2)
        result = num1
    else
        result = num2

    println(result)


//What's new?
    //  not branching but also expression

    //Similar to ternary operator
    result =  if(num1>num2)
       num1
    else
        num2
            println(result)

    //else -if in Kotlin
    result =  if(num1>num2)
        num1
    else if(num1<num2)
        num2
    else //If both are same
        0
    println(result)
     */

    /*
//String Comparison
    var str1 : String = "Navin"
    var str2 : String = "navin"

    //In java
    if(str1.equals(str2, true))
        println("Same")
    else
        println("Not same")

    //In Kotlin
    if(str1==str2) //== is case sensitive
        println("Same")
    else
        println("Not same")
     */
    /*
    //Null Handling
//    var str : String = null // Kotlin does not allow null value
    var str : String? = null //Allows null
    var tittu = Alien2()

    println(tittu.name) //Prints null
//    println(tittu.name.length) //Error - Null pointer exception
    println(tittu.name?.length)

//    var tittu : Alien2? = Alien2() //Specify type with ?
//    println(tittu?.name) //Prints null
//    println(tittu?.name?.length)
     */

//    //When Expression - switch (Break Statement)
//    val num : Int = 2
//    when(num)
//    {
//        1 -> println("One")
//        2 -> println("Two")
//        3 -> println("Three")
//        else-> println("Give a proper input")
//    }
//    var str = when(num)
//    {
//        1 -> "One"
//        2 -> "Two"
//        3 -> "Three"
//        else-> "Give proper input"
//    }
//    println("Str is : $str")
//------------------------------------------
    /*
//    Loops and range
//    While - do while same

//    while - when we don't know range
    //for - when we  know range

    //Range
//    var nums = 1 .. 15 //Range - with 15 values
//    var nums = 1 .. 16 //Range - 16
//    var nums = 1 until 16 //Range - 15

//    var nums = 16 .. 1 //Nothing

//    var nums = 16 downTo 1 //
//    var nums = 16.downTo(1) //Method

//
//    for (a in nums)
//    {
//        println(a)
//    }
//    for (a in nums step 2)
//    {
//        println(a)
//    }
    //Print in reverse
//    for (a in nums.reversed())
//    {
//        println(a)
//    }
//    //Type of num? class - range
//    println("Count is : " + nums.count())

    //Char range
    var nums = 'A' .. 'z'
    for (a in nums)
    {
        println(a)
    }


    //for each - Enhanced for loop
//    for(int a : nums)
//    {
//
//    }

     */

//    --------------------------------------
//    List & Map
     var nums = listOf(1,2,3,4)
    for (i in nums)
    {
        println(i)
    }
    //Print index num
    for ((i,e) in nums.withIndex())
    {
        println(" $i : $e")
    }

    //Map
    var aliens = TreeMap<String,Int>()
    aliens["Navin"] = 543
    aliens["Kishor"] = 409
    for ((name, age) in aliens)
    {
        println("$name : $age")
    }
}
//