package lecture7

class A (private val a:Int) {
    private val b by lazy {
        99
    }

    fun printA() {
        println(a)
        println(b)
    }
}