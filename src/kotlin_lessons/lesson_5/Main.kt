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
        // (но тут надо числа больше 15_000_000)
/*        val set = HashSet<Int>()
        val size = 5_000_000
        for (i in 0 until size) {
            set.add(MyItem(i, "$i").hashCode())
        }
        println(set.size - size)*/


        val map = HashMap<MyItemJava, Int>()
        val size = 5_000_000

        var hashCodeCalls = 0
        var equalsCalls = 0

        val callback = object : MyCallback {
            override fun hashCodeCalled() {
                hashCodeCalls++
                if (hashCodeCalls % 100000 == 0)
                    println("hashCodeCalls: $hashCodeCalls")
            }

            override fun equalsCalled() {
                equalsCalls++
                println("equalsCalls: $equalsCalls")
            }
        }

        for (i in 0 until size) {
            map[MyItemJava(i, "$i", callback)] = i
        }
        println("hashCodeCalls: $hashCodeCalls, equalsCalls: $equalsCalls")

    }

    fun <T> MutableList<T>.addItem(item: T) {
        if (!contains(item))
            add(item)
    }

    fun String.getLastIndex(): Int = length - 1

}