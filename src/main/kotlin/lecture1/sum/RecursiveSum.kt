package lecture1.sum

object RecursiveSum {

    @JvmStatic
    fun main(args: Array<String>) {
        println(sum(10))
    }

    private tailrec fun sum(n: Int, sum: Double = .0): Double {
        println(n)
        var sum: Double = n.toDouble() + sum
        return if (n > 0) {
            sum(n - 1, sum)
        } else if (n < 0) {
            sum(n + 1, sum)
        } else {
            sum
        }
    }
}