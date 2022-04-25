fun jumlah(a: Int, b: Int, c: Int): Int {
    val total = a + b - c
    return total
}
fun bagi(a: Int, b: Int): Int{
    if (b == 0){
        return 0
    }
    else{
        val result = a/b
        return result
    }

}
fun main() {
    println(jumlah(10,10, 5))
    println(jumlah(100,100, 10))

    val result = jumlah(200,200, 20)
    println(result)

    jumlah(5,5, 4) //jika kita menuliskannnya seperti ini maka datanya tidak akan menangkap dan menjadi sia sia

    println(bagi(20, 0))
}