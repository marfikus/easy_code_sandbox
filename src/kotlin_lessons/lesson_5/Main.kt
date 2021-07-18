package kotlin_lessons.lesson_5

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        var str: String = "dffsfgg"
        println(str.getLastIndex())

    }

    fun String.getLastIndex(): Int = length - 1

}