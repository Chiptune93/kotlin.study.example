fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("the result is $result")
}

fun main() {
    twoAndThree { a, b -> a + b }
    twoAndThree { a, b -> a * b }
}
