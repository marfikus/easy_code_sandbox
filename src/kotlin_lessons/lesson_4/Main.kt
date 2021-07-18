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

/*        for ((index, value) in arr.withIndex()) {
            println("index: $index, value: $value")
        }*/

/*        outer@ for (i in 0..2) {
            for (j in 0..2) {
                println("$i $j")
                if (j == 1) {
                    break@outer
                }
            }
        }*/

        var x = 0
        outer@ while (true) {
            println("outer")
            while (true) {
                println("inner")
                if (x == 2)
                    break@outer
                x++
            }
        }

//        doSome(2)
//        doSome2(2, arrayOf(1, 5, 3, 2))

    }

    fun doSome(max: Int) {
        for (i in 0..max) {
            if (i == 3)
                return
        }
        println("done")
    }

    fun doSome2(max: Int, array: Array<Int>) {
        array.forEach {
            if (it == max)
                return@forEach
        }
        println("done")
    }

}