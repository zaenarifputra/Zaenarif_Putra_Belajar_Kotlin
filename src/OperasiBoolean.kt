fun main() {

    // Operasi Boolean digunakan untuk menggabungkan 2 nilai boolean

    val nilaiUjian = 90
    val nilaiAbsen = 60
    val nilaiEkstra = 80

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusEkstra = nilaiEkstra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen || apakahLulusEkstra
    println(apakahLulus)

}