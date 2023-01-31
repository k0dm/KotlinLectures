package lecture8

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val person1 = Person(-1).apply {
            setAge(10)
            getAge()
        }

        val list = listOf(1, 34, -34, -4, 0, -2, -1)
        println(getNewPositiveList(list))
        println(list)
        println(getNewList(list,"num"))
        println(list.subList(1,5))
    }

    private fun getNewPositiveList(source: List<Int>) = source.filter { it > 0 }
    private fun getNewList(source: List<Int>, prefix: String) = source.map { prefix + it }

}