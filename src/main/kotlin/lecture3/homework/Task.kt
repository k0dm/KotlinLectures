package lecture3.homework


class Task(
    private val id: Int,
    private val status: Status,
    private val description: String = "",
    private val designLink: String = "",
    private val testcase: String = "",
    private val buildLink: String = ""
) {

    fun getId() = id
    fun getStatus() = status
    fun getDescription() = description
    fun getDesignLink() = designLink
    fun getTestcase() = testcase
    fun getBuildLink() = buildLink

    enum class Status {
        ASSEMBLING_REQUIREMENTS,
        READY_TO_DO,
        READY_FOR_TESTING,
        DONE
    }
}