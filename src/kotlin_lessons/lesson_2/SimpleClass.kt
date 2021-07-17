package kotlin_lessons.lesson_2

class SimpleClass {

    private val data: Int

    constructor(text: String = "") : this(text.length)

    constructor(number: Int) {
        data = number
        println("constructor called")
    }

    init {
        println("some code...")
    }

    class NestedClass(private val s: Int) {

    }

}