package kotlin_lessons.lesson_6

open class AImpl(private val i: Int, override val data: String) : A {

    override fun doOne() {
        println("oneA $i")
    }

    override fun doTwo() {
        println("two")
    }

}