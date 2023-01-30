package lecture4

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val array = arrayOf("d", "a", "dsd")
        for ((index, value) in array.withIndex()) {
            println("index $index - value $value")
        }


        loop@ for (element in array) {
            for (i in 0..10) {
                println("$element - i=$i")
                if (i == 7) {
                    break@loop
                }
            }
        }

        val intArray = arrayOf(1,2,3,4,5,6,32,4,3)
        println(findNumber(31,intArray))

        //arrays

        val anotherArray = Array(10) { (it+1) * (it+1)}
        anotherArray.forEach { println(it) }

        val anyArray = arrayOf(2,4,5, "43").forEach {
            if (it is String) {
                println(it)
            }
        }

    }

    fun findNumber(max: Int, array: Array<Int>): Int? {
        var result: Int? = null
        array.forEach {
            if (max == it) {
                result = max
                return@forEach
            }
        }
        return result
    }

}
