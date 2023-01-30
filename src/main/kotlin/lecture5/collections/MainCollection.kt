package lecture5.collections

object MainCollection {
    @JvmStatic
    fun main(args: Array<String>) {
        val list = mutableListOf("Tea", "Coffee",  "Water")
        list.removeAll(listOf("Tea", "Water"))
        list.forEach{
            println(it)
        }

        val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
        val petsSophia = listOf("Cat", "Owl")
        val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
        val petsEmily = listOf("Hedgehog")
        val allPets = mutableListOf<String>().apply {
            addAll(petsLiam)
            addAll(petsSophia)
            addAll(petsNoah)
            addAll(petsEmily)
            toList()
        }

        println("all pets: ${allPets.size}")
        println("unique pets: ${allPets.toSet().size}")
        val sortedUniquePets = allPets.toSet().toMutableList().apply { sort() }
        println("sort unique pets: $sortedUniquePets")


        val r1 = Recipe("Chicken Soup")
        val r2 = Recipe("Quinoa Salad")
        val r3 = Recipe("Thai Curry")
        val r4 = Recipe("Jambalaya")
        val r5 = Recipe("Sausage Rolls")
        val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
        println("mRecipeMap original: $mRecipeMap")
        val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
        mRecipeMap.putAll(recipesToAdd)
        println("mRecipeMap updated: $mRecipeMap")
        if (mRecipeMap.containsKey("Recipe1")) {
            println("Recipe1 is: ${mRecipeMap["Recipe6"]}")
        }


        val term1 = "Array"
        val term2 = "List"
        val term3 = "Map"
        val term4 = "MutableList"
        val term5 = "MutableMap"
        val term6 = "MutableSet"
        val term7 = "Set"
        val def1 = "Holds values in no particular order."
        val def2 = "Holds key/value pairs."
        val def3 = "Holds values in a sequence."
        val def4 = "Can be updated."
        val def5 = "Can't be updated."
        val def6 = "Can be resized."
        val def7 = "Can't be resized."
        val glossary = mapOf(
            term4 to "$def3 $def4 $def6",
            term7 to "$def1 $def5 $def7",
            term1 to "$def3 $def4 $def7",
            term5 to "$def2 $def4 $def6",
            term2 to "$def3 $def5 $def7",
            term6 to "$def1 $def4 $def6",
            term3 to "$def2 $def5 $def7"
        )
        for ((key, value) in glossary) println("$key: $value")
    }

    data class Recipe(val name: String)
}