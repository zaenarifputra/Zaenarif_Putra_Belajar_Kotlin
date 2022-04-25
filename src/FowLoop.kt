fun main() {

    var array = arrayOf("Zaenarif", "Putra", "Ainurdin", "Joko", "Budi", "Jeda")

    var total = 0
    for (name in array){
        println(name)
        total++
    }
    println("Total Perulangan = $total")


    val ukuranArray = array.size -1
    for (i in 0..ukuranArray){
        println("index $i = ${array.get(i)}")
    }
    for (i in 10 downTo 0 step 5){
        println(i)
    }
}