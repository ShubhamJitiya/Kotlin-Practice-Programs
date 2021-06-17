import java.lang.NumberFormatException

fun main() {
    var str : String = "4a"
//    var num : Int = 0
//
//
//    try{
//        var num: Int = str.toInt()
//    }
//    catch(e: NumberFormatException)
//    {
//        println("Give me proper input")
//    }
//    finally {
//        println("We are in finally\nClosing resources")
//    }

    //Other way
    var num : Int = try{
        str.toInt()
    }
    catch(e: NumberFormatException)
    {
        -1
    }
    finally {
        println("We are in finally\nClosing resources")
    }

    println(num)
}

//Try returns something