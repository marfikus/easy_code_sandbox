package kotlin_lessons.lesson_2

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        Singleton.incement()
        Singleton.incement()
        Singleton.print()

        val simpleClass = SimpleClass()

    }

}

object Singleton {

    private var x = 0

    fun incement() {
        x++
    }

    fun print() {
        println(x)
    }
}