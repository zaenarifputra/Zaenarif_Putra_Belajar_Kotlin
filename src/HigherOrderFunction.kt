fun main() {

    fun hello(name: String, transformer: (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Helo $nameTransform"
    }

    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(hello("Putra", lambdaUpper))

    println(hello("Putra", {value: String -> value.toLowerCase()}))

    val result1 = hello("Putra", { value: String -> value.toLowerCase() })
    val result2 = hello("Putra"){ value: String ->
        value.toLowerCase()
    }
}