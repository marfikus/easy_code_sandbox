package kotlin_lessons.lesson_2

class SimpleClass {

    private val data: Int

    constructor(text: String = "") {
        data = text.length
    }

    constructor(number: Int) {
        data = number
    }
}