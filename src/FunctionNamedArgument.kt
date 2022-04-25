fun fullName(
    firstName: String,
    middleName: String,
    lastName: String,
) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Zaenarif", "Putra", "Ainurdin")
    fullName(
        lastName = "Ainurdin",
        firstName = "Zaenarif",
        middleName = "Putra"
    )
}