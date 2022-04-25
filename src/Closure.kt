fun main() {

    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda increment")
        counter++
    }

    val anonymousIncrement = fun(){
        println("Anonymus Function Increment")
        counter++
    }

    fun functionIncrement(){
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}