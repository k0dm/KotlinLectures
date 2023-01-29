package lecture3.homework

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val taskFactory = TaskFactory()

        val callback = object : TaskProgressCallback {
            override fun updateTask(task: Task) {
                taskFactory.updateTask(task)
            }
        }

        val designer = Employee.Designer(callback, "Alisa")
        val programmer = Employee.Programmer(callback, "Peter")
        val tester = Employee.Tester(callback, "Ivan")

        val employeeChain = EmployeeChain(
            designer,
            EmployeeChain(programmer, tester)
        )

        while (true) {
            if(!employeeChain.doTask(taskFactory.getTask())){
                break
            }
        }

    }
}