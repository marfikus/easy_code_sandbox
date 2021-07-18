package kotlin_lessons.lesson_5

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

/*        var str: String = "dffsfgg"
        println(str.getLastIndex())*/

//        val list = mutableListOf(MyItemJava(1, "1"))
//        list.addItem(MyItemJava(1, "1"))
        val list = mutableListOf(MyItem(1, "1"))
        list.addItem(MyItem(1, "1"))

//        val item = MyItemJava(1, "1")
//        val list = mutableListOf(item)
//        list.addItem(item)

//        print(list)

        // демонстрация того, что на разных объектах хешкоды могут совпадать
        // (при большом количестве итераций
        // в множестве будет меньше элементов, чем задали)
        val set = HashSet<Int>()
        val size = 5_000_000
        for (i in 0 until size) {
            set.add(MyItem(i, "$i").hashCode())
        }
        print(set.size - size)

    }

    fun <T> MutableList<T>.addItem(item: T) {
        if (!contains(item))
            add(item)
    }

    fun String.getLastIndex(): Int = length - 1

}