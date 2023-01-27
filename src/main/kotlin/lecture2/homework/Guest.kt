package lecture2.homework

import java.util.*

class Guest(private val id: Int, private var money: Int) : Observer {

    private var numOfCupsOfCoffeeDrunk = 0
    private var drinkСoffee = false


    override fun drinkCoffee(price: Int) {

        println("Guest id$id start drinking a coffee!")

        money -= price
        if (money < 0) {
            throw Exception("ERROR, guest has " + money + "dollars")
        }
        drinkСoffee = true

        Timer().schedule(object : TimerTask() {
            override fun run() {
                drinkСoffee = false
                numOfCupsOfCoffeeDrunk++
                println("Guest id$id finished drinking a $numOfCupsOfCoffeeDrunk coffee!")

                cancel()
            }
        }, (2 + Random().nextInt(6)) * 1000L)

    }

    override fun canDrinkACupOfCoffee(price: Int): Boolean {
        return !drinkСoffee && money >= price
    }
}