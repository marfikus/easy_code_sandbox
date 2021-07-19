package kotlin_lessons.lesson_6

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

//        val a = AImpl()
//        val b = BImpl()
//        a.doOne()
//        b.doThree()

//        val c = C(AImpl(), BImpl())
//        c.doOne()
//        c.doThree()

        val c = C(4, "ttt")
        c.doOne()

    }

    // пример множественного наследования
//    class C(private val i: Int) : AImpl(i, "text"), B {
    class C(private val i: Int, override val data: String) : A, B {

        override fun doOne() {
            super<A>.doOne()
            super<B>.doOne()
            println("oneC $i")
        }

        override fun doTwo() {
            TODO("Not yet implemented")
        }

    }
}