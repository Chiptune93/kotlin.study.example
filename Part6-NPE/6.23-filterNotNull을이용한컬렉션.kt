package `Part6-NPE`

import java.io.BufferedReader
import java.io.StringReader

fun addValidNumbers2(numbers: List<Int?>) {
    val validNumbers = numbers.filterNotNull()
    println("Sum of vaild numbers: ${validNumbers.sum()}")
    println("Invalid numbers: ${numbers.size - validNumbers.size}")
}

fun main() {
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)
    addValidNumbers2(numbers)
}
