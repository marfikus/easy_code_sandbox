package kotlin_lessons.lesson_8

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val d = Data()
        d.i = 5
//        d.show()
//        println(d.i)

        d.add("1")
        d.add("2")
        d.show()
        println(d.copy)

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