
fun main(args: Array<String>) {
    var nums = intArrayOf(10,12,14,15)
//    var nums = intArray(4)
//    var nums = doubleArray(4)
//    var nums1 = arrayOfNulls<String>(4)

//    nums[1] = 13
    nums.set(1,13)

//    for (i in nums)
//    {
//        println(i)
//    }
    println(nums[3])
    println(nums.get(3))
    println(nums.last())

}