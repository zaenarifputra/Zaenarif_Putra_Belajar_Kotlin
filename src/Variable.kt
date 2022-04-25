const val APP = "Belajar Kotlin Dasar"
const val VERSION = "0.0.2"

fun main() {

    val fistname = "Zaenarif"
    val age = 20

    println(fistname)
    println(age)

    var name: String? = null
    name = "Putra"
    println(name)
    println(name.length)

    println("$APP : $VERSION")

    // immutable menggunakan val
   // mutable menggunakan var
  // yang buat di akses dimanapun menggunakan constant
}