package kotlin_lessons.lesson_2

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

//        Singleton.incement()
//        Singleton.incement()
//        Singleton.print()

//        val simpleClass = SimpleClass("ddd")
//        val simpleClass2 = SimpleClass(4)

        val javaClass = JavaClass()
        println(javaClass.i)
        javaClass.i = 5
        println(javaClass.i)

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