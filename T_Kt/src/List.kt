fun main(args: Array<String>) {
//    var values: List<Int> = listOf<Int>(8,9,4,2)
//
//    for (i in values)
//    {
//        println(i)
//    }
//    println(values.get(0))
//    println(values.indexOf(8))

    var values: MutableList<Int> = mutableListOf<Int>(8,9,4,2)
for (i in values)
{
    println("Before:  " + i)
}
    values.add(2,3)
//    var values: List<Int> = listOf<Int>(8,9,4,2)
    for(i in values)
    {
        println("After" + i)
    }

}
//List -
    //1. Read only - by default : Thread safe
    //2. mutable