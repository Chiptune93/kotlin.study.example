package `Part2-Basic`

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException


fun readNumber3(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine()) // 이 식의 값이 try 식의 값이 된다.
    } catch (e: NumberFormatException) {
        null // 예외가 발생하면 null 리턴.
    }
    print(number)
}

fun main() {
    val reader = BufferedReader(StringReader("not a number!"))
    readNumber3(reader) // 출력값이 없다!
}
