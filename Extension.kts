// adding a function to a class like String use dot notation.
fun String.hasSpaces(): Boolean {
    val found = this.indexOf(' ')  
    // also valid: this.indexOf(" ")
    // returns positive number index in String or -1 if not found
    return found != -1
}

class AquariumPlant(val color: String, private val size: Int)

fun AquariumPlant.isRed() = color == "red" 
// you cannot use private variables to add fuctions to a class
fun AquariumPlant.isBig() = size > 50        // gives error

// same thing for variables of you want to add a get function to a variable in a class 
val AquariumPlant.isGreen: Boolean
   get() = color == "green"

// so it checks if AquariumPlant class exists and if not it ignores the function 
// and same for the instance variable this 
fun AquariumPlant?.pull() {
   this?.apply {
       println("removing $this")
   }
}

val plant: AquariumPlant? = null
plant.pull()