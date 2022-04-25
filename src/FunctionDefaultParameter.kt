fun hello(firstName: String, lastName: String? = null){
    if (lastName == null){
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }

}

fun main() {
    hello("Putra")
    hello("Zaenarif", "Putra")
    hello("Jaka")
    hello("Budi", "Dermawan")
}