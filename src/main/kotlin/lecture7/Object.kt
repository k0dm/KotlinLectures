package lecture7

object Object {


    @JvmStatic
    fun main(args: Array<String>) {
        val a = A(1)

        println("with")
        with(a) {
            printA()
            B().printA(a)
        }

        println("\nlet")
        println( A(3).let {a->
            a.printA()
            B().printA(a)
        })

        println("\nalso")
        println(a.also { a->
            a.printA()
            B().printA(a)
        })

        println("\nrun")

        val a1: A? = null
        with(a1) {
            this?.printA()
            a1?.printA()
        }

        a1?.run {
            this.printA()
            a1.printA()
        }
    }
}