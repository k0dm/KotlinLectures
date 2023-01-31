package lecture8

import java.lang.IllegalArgumentException

class Person(age:Int){

    private var age = age
        set(value)  {
            if (value < 0 || value > 120){
                throw IllegalArgumentException("invalid age $value")
            }
            else{
                field = value
            }
        }
    fun getAge():Int {
        return age
    }
    @JvmName("setAge1")
    fun setAge(age: Int) {
        this.age  = age
    }
}