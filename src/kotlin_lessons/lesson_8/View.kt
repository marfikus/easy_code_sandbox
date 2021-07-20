package kotlin_lessons.lesson_8

class View(private val name: String) : Loader.View {

    private var buttonEnabled: Boolean = true
    private var progressVisible: Boolean = false

    override fun setButtonEnabled(enabled: Boolean) {
        buttonEnabled = enabled
        println("$name: buttonEnabled is $buttonEnabled")
    }

    override fun showProgress(show: Boolean) {
        progressVisible = show
        println("$name: progressVisible is $progressVisible")
    }

    override fun showError() {
        println("$name: Error!!!")
    }
}