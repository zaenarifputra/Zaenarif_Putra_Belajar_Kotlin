fun main() {

    fun hello(name: String, transformer: (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Helo $nameTransform"
    }

    val upper = fun(value: String):String {
        if (value == ""){
            return "UPS"
        }else{
            return value.toUpperCase()
        }
    }

    println(hello("Putra", upper))
    println(hello("", upper))

    println(hello("Ainurdin", fun(value: String): String {
        return value.toLowerCase()
    }))

}