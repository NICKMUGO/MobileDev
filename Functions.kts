import java.util.*    // required import
fun fishFood(day:String):String {
    return when(day){
        "Monday"-> "flakes"
        "Tuesday"-> "pellets"
        "Wednesday"->"redworms"
        "Thursday"-> "granules"
        "Friday"-> "mosquitoes"
        "Saturday"-> "lettuce"
        "Sunday"-> "plankton" 
        else -> "nothing"            
    }
}

fun main() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun swim(speed: String = "fast") {
   println("swimming $speed")
}

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}
// Lambda function
var dirtyLevel = 20
val waterFilter = { dirty : Int -> dirty / 2}
println(waterFilter(dirtyLevel))
// passing a normal function as a parameter
fun increaseDirty( start: Int ) = start + 1
println(updateDirty(15, ::increaseDirty))
swim()   // uses default speed
swim("slow")   // positional argument
swim(speed="turtle-like")   // named parameter
val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
// val isUnit = println("This is an expression")
// println(isUnit)
// When a function does not explicitly have a return statement, the function returns Unit (formally kotlin.Unit)
main()