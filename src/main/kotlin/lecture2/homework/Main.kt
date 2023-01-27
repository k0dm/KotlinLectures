package lecture2.homework

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val guest1 = Guest(1,30)
        val guest2 = Guest(2,10)
        val guest3 = Guest(3,20)

        val waiter = Waiter(10).apply {
            registerObserver(guest1)
            registerObserver(guest2)
            registerObserver(guest3)
        }

        waiter.start()
    }
}