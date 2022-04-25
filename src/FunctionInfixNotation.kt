infix fun String.to(type: String): String {
    if (type == "UP"){
        return this.toUpperCase()
    }
    else{
        return this.lowercase()
    }
}

fun main() {
    val result = "Zaenarif Putra" to "LO"
    println(result)
}