fun main() {

    val school = listOf("Elementary", "Middle", "High", "College")
    println(school)

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")

    val fishArray = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(fishArray))

    val mix = arrayOf("fish", 2)

    val numbers1 = intArrayOf(1, 2, 3)
    val numbers2 = intArrayOf(4, 5, 6)
    val foo2 = numbers2 + numbers1
    println(foo2[5])

    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers1.toList(), oceans, "salmon")
    println(oddList)

    val array = Array(5) { it * 2 }
    println(java.util.Arrays.toString(array))

}

fun filter() {
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, creates a new list
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")
       // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
        // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations.asSequence().map {
    println("access: $it")
    it
    }
    val result = lazyMap.toList()   // forces evaluation
    println("result: $result")
    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")
}
main()
filter()