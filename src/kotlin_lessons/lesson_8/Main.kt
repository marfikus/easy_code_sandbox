package kotlin_lessons.lesson_8

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val d = Data()
        d.i = 5
        d.show()
        println(d.i)

    }

    class Data {

        var i: Int = 0
            set(value) {
                if (value > 100)
                    field = value
            }
            get() = field + 1

        fun show() {
            println(i)
        }
    }

}