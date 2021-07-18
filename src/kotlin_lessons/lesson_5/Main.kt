package kotlin_lessons.lesson_5

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

/*        var str: String = "dffsfgg"
        println(str.getLastIndex())*/

        val list = mutableListOf(MyItem(1, "1"))
        list.addItem(MyItem(1, "1"))

//        val item = MyItem(1, "1")
//        val list = mutableListOf(item)
//        list.addItem(item)

        print(list)

    }

    fun <T> MutableList<T>.addItem(item: T) {
        if (!contains(item))
            add(item)
    }

    fun String.getLastIndex(): Int = length - 1

}