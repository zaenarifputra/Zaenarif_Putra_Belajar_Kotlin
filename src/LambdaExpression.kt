fun toUpper(value: String): String = value.toUpperCase()

fun main() {

    val contohLambda: (String, String) -> String = {firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Zaenarif", "Putra")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Putra"))

    val  toUpperCase : (String) -> String = :: toUpper
    println(toUpperCase("Zaenarif Putra"))
}