fun main() {

    // Tipe Data String
    var firstname: String = "Putra"
    var lastname: String = "Ainurdin"

    var address: String = """
        >Jl Cipanas,
        >Province Karawang,
        >Country Indonesia 
    """.trimMargin(">")

    println(firstname)
    println(lastname)
    println(address)

    var fullname: String = "$firstname  $lastname"
    println(fullname)

    var desc: String = "$fullname length = ${fullname.length}"
    println(desc)
}