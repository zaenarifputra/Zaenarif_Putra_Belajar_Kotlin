fun sayHello(fisrtName:String, lastName: String?){
    if (lastName == null){
        println("Hello $fisrtName")
    }else{
        println("Hello $fisrtName $lastName")
    }
}

fun main() {
    sayHello("Zaenarif", "Putra")
    sayHello("Budi", null)
    sayHello("Joko", "Bundar")
}