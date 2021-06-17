//In java - Integer.parseInt(convertsStringToInt)
fun main() {
    var str : String = "a"
//    var num : Int = Integer.parseInt(str)
    var num : Int = str.toInt() //Indirectly it is using above code
    num++
    println(num)
}