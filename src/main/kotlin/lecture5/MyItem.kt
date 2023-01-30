package lecture5

class MyItem(
    private val i: Int,
    private val s: String,
    private val callback: MyCallback
) : Comparable<MyItem> {
    override fun toString(): String {
        return "MyItem{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}'
    }

    override fun compareTo(other: MyItem): Int {
        callback.compareCalled()
        return this.i.compareTo(other.i)
    }

    override fun equals(other: Any?): Boolean {
        callback.equalsCalled()
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MyItem

        if (i != other.i) return false
        if (s != other.s) return false

        return true
    }

    override fun hashCode(): Int {
        callback.hashCodeCalled()
        var result = i
        result = 31 * result + s.hashCode()
        return result
    }

}
