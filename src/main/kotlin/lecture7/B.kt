package lecture7

class B () {
    private val b by lazy {
        -99
    }
    fun printB() {
        println(b)
    }
    fun printA(a:A) {
       a.printA()
    }
}