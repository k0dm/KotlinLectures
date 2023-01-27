package lecture2.homework

import java.util.Timer
import java.util.TimerTask
import kotlin.random.Random

class Waiter(val priceOfCoffee:Int):Observable {

    private val observers = ArrayList<Observer>()
    private val timer = Timer()
    fun start() {
        timer.schedule(TaskOffer(), 5000)
    }


    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }
    override fun notifyObservers() {
        for (observer in observers){
            if(observer.canDrinkACupOfCoffee(priceOfCoffee)) {
                observer.drinkCoffee(priceOfCoffee)
            }
        }
    }
    inner class TaskOffer: TimerTask() {
        override fun run() {
            println("The waiter offer a cup of coffee ($priceOfCoffee$)")
            notifyObservers()
            timer.schedule(TaskOffer(),5000)
        }
    }
}