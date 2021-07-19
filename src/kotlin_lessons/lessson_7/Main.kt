package kotlin_lessons.lessson_7

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val a = A()
        a.doAny()
        a.doAny()

    }

    class A {

//        private lateinit var b: B
        //        private var b: B = B()
//                private var b: B? = null
        private val b by lazy { B() }

        fun doAny(flag: Boolean = false) {
//            b?.doSome()
//            if (flag) {
/*                if (b == null)
                    b = B()
                b!!.doSome()*/
                b.doSome()
//            }
        }
    }

    class B {

        constructor() {
            println("create B")
        }

        fun doSome() {
            println("call b")
        }
    }

}