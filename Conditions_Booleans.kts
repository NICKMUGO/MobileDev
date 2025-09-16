fun main(){
    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!") 
    } else {
        println("Unhealthy ratio")
    }
    val fish=50

    if (fish in 1..100) {
        println(fish)
    }

    if (numberOfFish == 0) {
    println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }
    when(numberOfFish){
        0 -> println("Empty tank")
        in 1..40 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
    // var rocks: Int = null
    var marbles: Int? = null
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }

    var fishFoodTreats = 6
    fishFoodTreats = fishFoodTreats?.dec()

    val len = s!!.length   // throws NullPointerException if s is null

    
}

main()