package lecture3.homework

import java.time.temporal.TemporalAdjuster

class TaskFactory {

    private val listOfTasks: MutableList<Task>
    private val number = 5

    constructor() {
        listOfTasks = ArrayList()

        for (index in 0..SIZE) {
            listOfTasks.add(Task(index, Task.Status.ASSEMBLING_REQUIREMENTS, "description $index"))
        }
    }



    companion object {
        const val SIZE = 10
    }

    fun getTask(): Task {
        var task: Task? = null
        for (curTask in listOfTasks) {
            if (curTask.getStatus() != Task.Status.DONE) {
                task = curTask
                break
            }
        }
        if (task == null){
            task = listOfTasks[0]
        }

        return task
    }
    fun updateTask(task: Task) {
        for(index in listOfTasks.indices) {
            if(listOfTasks[index].getId() == task.getId() ) {
                listOfTasks[index] = task
                break
            }
        }
    }


}