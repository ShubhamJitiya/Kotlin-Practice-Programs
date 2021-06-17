fun main(args : Array<String>)
{
//    var finalAmt = calcAmount(50, 0.04)
    var finalAmt = calcAmount(50 , 0.03)
//    var finalAmt = calcAmount(amt = 50 , interest = 0.03) //Named parameter - more readable
//    var finalAmt = calcAmount(50) //Error in java file
    println(finalAmt)
}

//Assign Default - Method over loading
fun calcAmount(amt : Int, interest : Double = 0.04) : Int //use capital D
{
    return (amt + amt*interest).toInt() //Cast
}
//How to call in java
//    In java compulsory we must give both parameter - JvmOverloads - creates two methods (one with int, one with int-double)
//In kotlin it is optional - take default value

//Named parameter
