package kotlin_lessons.lesson_3

import java.lang.IllegalArgumentException
import java.lang.IllegalStateException

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

//        println(max(5, 3))
//        checkNumber(0)
//        convertGrade(5)

//        var x: Int? = null
//        check(x)

//        val a: Int? = 3
//        println((a as? String)?.length)


        val repository = object : Repository {
            override fun getData(): Result {
                TODO("Not yet implemented")
            }
        }

        when (val result = repository.getData()) {
            is Result.Success -> print(result.data)
            is Result.Error -> throw IllegalArgumentException(result.message)
        }

    }

    fun check(x: Any?) {
        when (x) {
            is String -> print("string")
            is Int -> print("int")
            null -> print("null")
            else -> print("Unknown type")
        }
        println()
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