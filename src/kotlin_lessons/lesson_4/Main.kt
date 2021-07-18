package kotlin_lessons.lesson_4

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

/*        for (i in 10 downTo 1 step 2) {
            println(i)
        }*/

        val arr = arrayOf("d", "g", "h")

/*        for (i in arr.indices) {
            println(arr[i])
        }*/

/*        for (i in 0 until arr.size) {
            println(arr[i])
        }*/

/*        for (element in arr) {
            println(element)
        }*/

        for ((index, value) in arr.withIndex()) {
            println("index: $index, value: $value")
        }



    }

}