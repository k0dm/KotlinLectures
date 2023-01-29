package lecture3

sealed class Result {
    class Success(val data: Int) : Result()
    class Error(val message: Int) : Result()
}
