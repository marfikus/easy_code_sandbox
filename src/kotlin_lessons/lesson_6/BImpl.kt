package kotlin_lessons.lesson_6

open class BImpl(private val i: Int, override val data: String) : B {

    override fun doOne() {
        println("oneB $i")
    }

/*    override fun doThree() {
        println("three")
    }*/
}