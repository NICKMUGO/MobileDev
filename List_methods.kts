val list = listOf(1, 5, 3, 4)
println(list.sum())

// strings need a number to sum
val list2 = listOf("a", "bbb", "cc")
println(list2.sumBy { it.length })


for (s in list2.listIterator()) {
    println("$s ")
}

val scientific = hashMapOf("guppy" to "animal", "catfish" to "corydoras", "zebra fish" to "danio rerio" )
println (scientific.get("guppy"))

println(scientific.getOrDefault("swordtail", "sorry, I don't know"))
