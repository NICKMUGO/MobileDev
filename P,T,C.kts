val equipment = "fish net" to "catching fish"
println("${equipment.first} used for ${equipment.second}")

val equipment2 = ("fish net" to "catching fish") to "equipment"
println("${equipment2.first} is ${equipment2.second}\n")
// second option of first variable definition in brackets
println("${equipment2.first.second}")

// Output
// ⇒ (fish net, catching fish) is equipment
// ⇒ catching fish

// Triple
// Destrutcturing a Triple
val numbers = Triple(6, 9, 42)
val (n1, n2, n3) = numbers
println("$n1 $n2 $n3")
