package lecture5

import java.util.*
import kotlin.Comparator
import kotlin.collections.HashMap

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val set = TreeSet<MyItem>()

        val map = HashMap<MyItem, Int>()

        val size = 30_000_000
        var hashcodeCalls = 0
        var equalsCalls = 0
        var compareCalls = 0

        var callback = object : MyCallback {
            override fun hashCodeCalled() {
                hashcodeCalls++
                if (hashcodeCalls % 100000 == 0) {
                    println("hashcodecalls $hashcodeCalls")
                }
            }

            override fun equalsCalled() {
                equalsCalls++
                println("equalscalls $equalsCalls")
            }

            override fun compareCalled() {
                compareCalls++
                if (compareCalls % 100000 == 0) {
                    println("comparecalls $compareCalls")
                }            }


        }

        for (i in 0 until size) {
            set.add(MyItem(i, "$i", callback))
        }
        println("hashcodes $hashcodeCalls equals $equalsCalls comparecalls $compareCalls")
    }

    private fun <T> MutableList<T>.addItem(item: T) {
        if (!contains(item)) {
            add(item)
        }
    }
}