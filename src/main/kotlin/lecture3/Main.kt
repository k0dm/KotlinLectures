package lecture3

import kotlin.IllegalArgumentException

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

      val repository = object : Repository{
          override fun getData(): Result {
              TODO("Not yet implemented")
          }
      }

        when (val result = repository.getData()) {
            is Result.Success -> println(result.data)
             is Result.Error -> throw IllegalArgumentException()
        }


    }

    private fun check(x: Any?) = when (x) {
        is String -> "It`s string"
        is Int? -> "It`s int or null"
        else -> "something else"
    }
}