package lecture3.homework

interface TaskHandler {
    fun doTask(task: Task): Boolean
}