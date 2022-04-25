fun main() {

    var nilai = "A"

    when(nilai){
        // if (nilai == "A" || nilai == "B" || nilai == "C") Jadi bakalan panjangan //
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Try Again Next Year")
        }
    }

    when(nilai){
        "A", "B", "C", "D" -> {
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Maaf Anda Tidak Lulus")
        }
    }

    nilai = "E"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C", "D")
    when (nilai){
        in nilaiLulus -> println("Selamat Anda Lulus")
        !in nilaiLulus -> println("Maaf Anda Tidak Lulus")
    }

    val name = "Putra"
    when(name){
        is String -> println("Name Is String")
        !is String -> println("Is Not String")
    }

    val nilaiUjian = 90
    when{
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Selamat Mengulang Kembali")
    }
}