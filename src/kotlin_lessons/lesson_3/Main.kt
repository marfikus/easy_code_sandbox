package kotlin_lessons.lesson_3

import java.lang.IllegalArgumentException

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        println(max(5, 3))
        checkNumber(0)
        convertGrade(5)

    }

    fun convertGrade(grade: Int) {
        when (grade) {
            5 -> print("A")
            4 -> print("B")
            3 -> print("C")
            2, 1 -> print("D")
            else -> throw IllegalArgumentException("Unknown grade!")
        }
        println()
    }

    fun checkNumber(x: Int) {
        when (x) {
            in 1..100 -> print("positive")
            0 -> print("zero")
            in -100..-1 -> print("negative")
            else -> print("out of range")
        }
        println()
    }

    fun max(a: Int, b: Int) = if (a > b) a else b

}