package kotlin_lessons.lesson_1

object Main {

    const val CONST = "dfd"

    @JvmStatic
    fun main(args: Array<String>) {

        println(sum(2, 8))

        var s = "dd"
        s = "44"
        val d = 33

        log("header", "body", "footer")
        log("header2", footer = "footer2")
        print("d", "f", "g")

        val myObject = MyObject()
        myObject.add("ddd")
        myObject add "dsfs"


        val l = singletonList("dfd")
        val l2 = singletonList(33)

//        printRecursive("test string", Int.MAX_VALUE / 1000)

        val list = mutableListOf<String>()
        list.add("ddd")
        list.add("fff")
        list.addItem("ddd")
        list.addItem("hhh")
        println(list)

    }

    // extension функции позволяют добавить функциональности классам
    private fun <T> MutableList<T>.addItem(item: T) {
        if (notContains(item)) {
            add(item)
        }
    }

    private fun <T> MutableList<T>.notContains(item: T): Boolean {
        return !contains(item)
    }

    // tailrec позволяет избежать stackoverflow
    private tailrec fun printRecursive(str: String, times: Int) {
        if (times == 0) {
            println("finishing")
        } else {
            println(str + times)
            printRecursive(str, times - 1)
        }
    }

    // `` позволяют использовать ключевые слова языка как имена
    private fun <T> singletonList(`object`: T): List<T> {
        val list = ArrayList<T>(1)
        list.add(`object`)
        return list
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

    // infix позволяет также вызывать метод через пробел
    infix fun add(str: String) {
        list.add(str)
    }
}