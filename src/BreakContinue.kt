fun main() {

    var i = 0

    while (true){
        println("Hello to $i")
        i++
        if (i > 10){
            break
        }
    }
    for (i in 1..100){
        if (i % 2 == 0){
            continue
        }
        println("Angka ke $i")
    }

}