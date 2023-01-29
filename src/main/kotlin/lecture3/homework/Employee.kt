package lecture3.homework

sealed class Employee(
    private val callback: TaskProgressCallback,
    private val name: String,
    private val taskStatus: Task.Status
) : TaskHandler {

    class Designer(callback: TaskProgressCallback, name: String) :
        Employee(callback, name, Task.Status.ASSEMBLING_REQUIREMENTS) {


        override fun getTaskWhenDone(task: Task) = Task(
            task.getId(),
            Task.Status.READY_TO_DO,
            task.getDescription(),
            task.getDesignLink(),
            task.getTestcase(),
            task.getBuildLink()
        )

        override fun getDetails(task: Task) =
            "with taskId" + task.getId() + " and description " + task.getDescription()


    }

    class Programmer(callback: TaskProgressCallback, name: String) :
        Employee(callback, name, Task.Status.READY_TO_DO) {
        override fun getTaskWhenDone(task: Task) = Task(
            task.getId(),
            Task.Status.READY_FOR_TESTING,
            task.getDescription(),
            task.getDesignLink(),
            task.getTestcase(),
            task.getBuildLink()
        )

        override fun getDetails(task: Task) =
            "with task id${task.getId()}" + " and designLink${task.getDesignLink()}" + " and testcase ${task.getTestcase()}"


    }

    class Tester(callback: TaskProgressCallback, name: String) :
        Employee(callback, name, Task.Status.READY_FOR_TESTING) {
        override fun getTaskWhenDone(task: Task) = Task(
            task.getId(),
            Task.Status.DONE,
            task.getDescription(),
            task.getDesignLink(),
            task.getTestcase(),
            task.getBuildLink()
        )

        override fun getDetails(task: Task) = "with task id" + task.getId() + "and testcase " + task.getTestcase()


    }


    override fun doTask(task: Task): Boolean {
        val canHandle = task.getStatus() == taskStatus

        if (canHandle) {
            println(
                javaClass.simpleName + " " + name + " is doing task " + getDetails(task)
            )
            callback.updateTask(getTaskWhenDone(task))
        }
        return canHandle
    }

    abstract fun getTaskWhenDone(task: Task): Task
    abstract fun getDetails(task: Task): String
}
