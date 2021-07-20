package kotlin_lessons.lesson_8

import kotlin.random.Random

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val d = Data()
        d.i = 5
//        d.show()
//        println(d.i)

        d.add("1")
        d.add("2")
//        d.show()
//        println(d.copy)


        val list1 = Array(20) { Random.nextInt(-10, 10) }
            .toList()
        println(list1)

        val list2 = list1
            .filter { it > 0 }
            .distinct()
            .sorted()
        println(list2)

        val list3 = list2.map { "number_$it" }
        println(list3)

    }

    class Data {

        var i: Int = 0
            set(value) {
                if (value > 100)
                    field = value
            }
            get() = field + 1

        private val list = mutableListOf<String>()

        val copy: List<String>
            get() = mutableListOf<String>().also { it.addAll(list) }

        fun add(x: String) = list.add(x)

        fun show() {
//            println(i)
            println(list)


        }
    }

}