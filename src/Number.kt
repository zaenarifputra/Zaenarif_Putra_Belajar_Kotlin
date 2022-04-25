fun main(){

//Tipe Data Number

    // underscore in number
    var age: Byte = 30 //Byte Nilainya (-128 - 127) jika kita masukkan angka lebih dari 127 makan akan terjadi error
    var height: Int = 170 //Int Nilainya (-2 milyar - 2 milyar) jika kita masukkan angka lebih dari 2 milyar makan akan terjadi error
    var distance: Short = 2000
    var balance: Long = 100000000L

    println(age)
    println(height)
    println(distance)
    println(balance)

    // floating point number
    var value: Float = 98.98F //Jika tipe data kita menggunakan float di ujung angka kita menggunakan penanda F
    var radius: Double = 234234234.54535
    println(value)
    println(radius)

    // literals
    var binary: Int = 0b10101010
    println(binary)

    // underscore (untuk penanda agar mempermudah membaca angka)
    var price: Long = 3_000_000_000L
    println(price)

    // conversion
    var priceInt: Int = price.toInt() //jika kita mengkonversi dari Long ke Int lebih dari 2 milyar maka akan terkena overflow
    println(priceInt)

    var doubleBinary: Double = binary.toDouble()
    println(doubleBinary)

}