package example.myapp
import java.lang.Math.PI
// the owrd 'open' allows the class to be inherited/ subclassed
open class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100
    var volume: Int 
        get() = width * height * length / 1000  
        set(value) {
        height = (value * 1000) / (width * length)
    }

    init {
        println("aquarium initializing")
    }
    init {
        println("Volume: ${width * length * height / 1000} liters")
    }
    // secondary constructor
    constructor(numberOfFish: Int) : this() {
    val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
    height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println(shape)
        println("Width: $width cm " +
            "Length: $length cm " +
            "Height: $height cm ")
        // 1 l = 1000 cm^3
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }
}

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
    // val myTower = TowerTank(diameter = 25, height = 40)
    // myTower.printSize()
}


fun main() {
    buildAquarium()
}

main()
// class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
//     override var volume: Int
//     override var water = volume * 0.8
//     // ellipse area = π * r1 * r2
//     override var shape = "cylinder"
//     // get() = (width/2 * length/2 * height / 1000 * PI).toInt()
//     // set(value) {
//     //     height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
//     // }

// }

interface FishAction  {
    fun eat()
}
interface FishColor {
    val color: String
}
// you can inherit from multiple interfaces
abstract class AquariumFish : FishAction,FishColor {
   abstract val color: String
   override fun eat() = println("yum")
}

class Shark: AquariumFish() {
    override val color = "grey"
}

class Plecostomus: AquariumFish() {
    override val color = "gold"
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")
}

fun main () {
    makeFish()
}

data class Decoration(val rocks: String) {
}

fun makeDecorations() {
    fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)
}
}

val rock = decoration.rock
val wood = decoration.wood
val diver = decoration.diver

val (rock, wood, diver) = decoration


// Here is a data class with 3 properties.
data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

fun makeDecorations() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main() {
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}

// Assign some properties to variables, ignore the others.
val (rock, _, diver) = d5