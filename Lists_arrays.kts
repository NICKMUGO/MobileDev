fun main(){

    val school = listOf("Elementary", "Middle", "High", "College")
    println(school)
    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    val school = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school))
    val mix = arrayOf("fish", 2)
    val numbers = intArrayOf(1,2,3)
    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])
    val numbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)
    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))
}
main()