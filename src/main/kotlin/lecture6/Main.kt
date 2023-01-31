package lecture6

object Main {

    interface A {
        val data: String
        fun doSomething() {
            println(data)
        }
    }

    interface B {
        val data: String
        val cache:String
        fun doSomething() {
            println(data + cache)
        }
    }

    class C(override val data: String, override val cache: String) : A, B {

        override fun doSomething() {
            super<A>.doSomething()
            super<B>.doSomething()
            println(data)
        }
    }


    @JvmStatic
    fun main(args: Array<String>) {
        val obj = C("hello","cache")
        obj.doSomething()
    }
    
}