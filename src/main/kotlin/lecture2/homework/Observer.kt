package lecture2.homework

interface Observer {
    fun drinkCoffee(price:Int)
    fun canDrinkACupOfCoffee(price: Int):Boolean
}