package lecture1.safelist

object SafeListExtensions {

    @JvmStatic
    fun main(args: Array<String>) {
        val list = mutableListOf<String>()
//        list.add("one")
//        list.add("two")
//        list.addItem("one")
        println( list.setItem(0, "five"))
//        list.forEach{
//            println(it)
//        }
        println(list.size)
    }



    private fun <E> MutableList<E>.setItem(index:Int, t:E): E? {
        var result:E? = if (isEmpty() || index >= size || index < 0 ) {
            null
        }else {
            set(index, t)
        }
        return result
    }

    private fun <T> MutableList<T>.addItem(item: T) {
        if (!contains(item)) {
            add(item)
        }
    }

}