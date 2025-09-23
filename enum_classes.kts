enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main() {
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
    println(Color.BLUE.rgb)
}
enum class Color(val rgb: Int) {
   RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}
main()

//sometimes you need a singleton function or property 
// that is associated with a class and not an instance. 
// In other languages such as Java you might use a static member. 
// Kotlin offers the companion object for this purpose

class Choice {
   companion object {
       var name: String = "lyric"
       fun showDescription(name:String) = println("My favorite $name")
   }
}

fun main() {
   println(Choice.name)
   Choice.showDescription("pick")
   Choice.showDescription("selection")
}

