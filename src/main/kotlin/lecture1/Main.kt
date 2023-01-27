package lecture1

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
//        print("sdfds", "dsfsdf", "4243")
        var myObject = MyObject()
        myObject.add("some string")
        myObject add "3343"
        myObject add("3343")
        printIt("text" , Int.MAX_VALUE/1000)

    }

    private tailrec fun printIt(str: String, times: Int) {
        if (times == 0) {
            println("done")
        }
        else {
            println(str + times)
            printIt(str, times-1)
        }

    }

    fun <T> singletonList(`object` : T): List<T> {
        val list = ArrayList<T>(1)
        list.add(`object`)
        return list
    }

    class MyObject {
        private val list = ArrayList<String>()

        infix fun add(str: String) {
            list.add(str)
        }
    }

    private fun print(vararg args: String) {
        for (string in args) {
            println(string)
        }
    }

    private fun sumIsThree(a: Int, b: Int) = a + b == 3

}