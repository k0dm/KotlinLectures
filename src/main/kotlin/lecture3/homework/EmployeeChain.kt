package lecture3.homework

class EmployeeChain(
    private val employee: TaskHandler,
    private val nextEmployee: TaskHandler?
) : TaskHandler {

    override fun doTask(task: Task): Boolean {
        var result:Boolean?
        result = if (employee.doTask(task)) {
            true
        } else {
            nextEmployee?.doTask(task)
        }
        if (result == null) {
            result = false
        }


        return result;
    }


}