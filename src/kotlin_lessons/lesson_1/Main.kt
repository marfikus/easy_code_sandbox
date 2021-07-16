package kotlin_lessons.lesson_1

object Main {

    const val CONST = "dfd"

    @JvmStatic
    fun main(args: Array<String>) {
        println(sum(2, 8));

        var s = "dd"
        s = "44"

        val d = 33

        log("header", "body")
        log("header2")

    }

    fun log(header: String, body: String = "") {
        if (header.isNotEmpty()) {
            println(header)
        }

        if (body.isNotEmpty()) {
            println(body)
        }
    }

    private fun sum(a: Int, b: Int) = a + b == 10
}