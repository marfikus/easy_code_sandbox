package kotlin_lessons.lesson_6

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val a = AImpl()
        val b = BImpl()

        a.doOne()
        b.doThree()

    }

    interface A {
        fun doOne()
        fun doTwo()
    }

    interface B {
        fun doThree()
    }

    class AImpl : A {
        override fun doOne() {
            println("one")
        }

        override fun doTwo() {
            println("two")
        }

    }

    class BImpl : B {
        override fun doThree() {
            println("three")
        }
    }

}