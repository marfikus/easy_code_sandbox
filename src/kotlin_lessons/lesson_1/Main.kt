package kotlin_lessons.lesson_1

object Main {

    const val CONST = "dfd"

    @JvmStatic
    fun main(args: Array<String>) {
        println(sum(2, 8));

        var s = "dd"
        s = "44"
        val d = 33

        log("header", "body", "footer")
        log("header2", footer = "footer2")
        print("d", "f", "g")

        val myObject = MyObject()
        myObject.add("ddd")
        myObject add "dsfs"

    }

    private fun print(vararg args: String) {
        for (string in args) {
            println(string)
        }
    }

    private fun log(header: String, body: String = "", footer: String) {
        if (header.isNotEmpty()) {
            println(header)
        }

        if (body.isNotEmpty()) {
            println(body)
        }

        if (footer.isNotEmpty()) {
            println(footer)
        }
    }

    private fun sum(a: Int, b: Int) = a + b == 10
}

class MyObject {
    private val list = ArrayList<String>()

    infix fun add(str: String) {
        list.add(str)
    }
}