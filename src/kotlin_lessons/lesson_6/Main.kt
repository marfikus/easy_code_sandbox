package kotlin_lessons.lesson_6

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val a = AImpl()
        val b = BImpl()

        a.doOne()
        b.doThree()

    }

}