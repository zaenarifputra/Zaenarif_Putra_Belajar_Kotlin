fun main() {
    // Array tidak dinamis
    val names: Array<String> = arrayOf("Joko", "Eko", "Doyok")
    // names.set(0, "Jo")
    names[0] = "Rudy"
    println(names[0])

    val nilai: Array<Int> = arrayOf(100,90,80,70)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])
    println(nilai[3])

    val members: Array<String?> = arrayOfNulls(5)
    members[0] = null
    members[0] = "Putra"
    members[0] = null
    members[0] = "Putra"
    println(members.size)
}