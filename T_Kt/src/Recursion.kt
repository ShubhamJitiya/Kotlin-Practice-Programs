import java.math.BigInteger

fun main() {
    var num = BigInteger("70000") //Exception - compiler is not optimised - tailrec
//    var fact = 1
//
//    Iterative method for factorial
//    for (i in 1..num) {
//        fact = fact * i
//    }
//
//    println(fact)
    println(fact(num, BigInteger.ONE))

}

//Recursion
//fun fact(num: Int): Int {
//    if (num == 0)
//        return 1
//    else
//        return num * fact(num - 1) //5*4! -> 4*3! ..l
//}

//Two ways

tailrec fun fact(num: BigInteger, result : BigInteger): BigInteger {
    if (num == BigInteger.ZERO) //Convert num to Int or 0 to BigInteger ->Preerable: Convert 0
        return result//OR
//        return BigInteger("1")
    else
        return fact(num - BigInteger.ONE, num*result)
    //5*4! -> 4*3! ..l
}

//tail recursion

