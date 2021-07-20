package kotlin_lessons.lessson_7

import java.io.BufferedInputStream
import java.io.File
import java.io.InputStream
import java.net.URL

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        // with просто позволяет не дублировать имя обЪекта
/*        val a = A()
        with(a) {
            doAny()
            doAny()
        }*/

        // let позволяет передать ссылку на объект внутрь (it)
/*        A().let {
            B().doSomeWithA(it)
        }*/


        // also как и let, но ещё возвращает результат
/*        val a3 = A().also {
            it.doAny()
            B().doSomeWithA(it)
        }
        a3.printS("fff")*/

        // или так
//        val a3 = getA()
//        a3.printS("rrr")

        // apply как и also, но не передаёт ссылку на объект внутрь
/*        val a4 = A().apply {
            doAny()
        }
        a4.printS("dd")*/

        // run похож на with, но можно работать с nullable (let тоже так может)
/*        val a5: A? = null
        a5?.run {
            doAny()
        }*/

        // use как аналог try with resources в java
        // в данном случае не надо самому закрывать стримы
        val url = "https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1920_18MG.mp4"

/*        BufferedInputStream(URL(url).openStream()).use {
            File("downloads/someVideo.mp4").copyInputStreamToFile(it)
        }*/

        // с использованием отдельного класса и лямбды
/*        Streams(BufferedInputStream(URL(url).openStream()),
                File("downloads/someVideo.mp4").outputStream()) { inputStream, outputStream ->
            inputStream.copyTo(outputStream)
        }.start()*/

        val r = someUseLambda(2, 3) { a, b ->
            a + b
        }
//        println(r)

        val lam2: (Int, Int) -> Int = { a, b ->
            a + b
        }
        println(lam2(3, 5))

    }

    fun someUseLambda(a: Int, b: Int, lam: (Int, Int) -> Int) = lam.invoke(a, b)

    fun File.copyInputStreamToFile(inputStream: InputStream) {
        this.outputStream().use { fileOut ->
            inputStream.copyTo(fileOut)
        }
    }

    fun getA(): A = A().also {
        it.doAny()
        B().doSomeWithA(it)
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

        fun printS(s: String) {
            println(s)
        }
    }

    class B {

        constructor() {
            println("create B")
        }

        fun doSome() {
            println("call b")
        }

        fun doSomeWithA(a: A, s: String = "text") {
            a.printS(s)
        }
    }

}