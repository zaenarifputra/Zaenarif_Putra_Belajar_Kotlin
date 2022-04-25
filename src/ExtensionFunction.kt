fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name = "Putra"

    println(name.hello())

    "Putra".printHello()
}