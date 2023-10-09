package `Part2-Basic`

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException


fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine()) // 이 식의 값이 try 식의 값이 된다.
    } catch (e:NumberFormatException) {
        return // 숫자가 아니어서 예외 발생하면 여기로 ... 값이 없음 ...
    }
    print(number)
}

fun main() {
    val reader = BufferedReader(StringReader("not a number!"))
    readNumber2(reader) // 출력값이 없다!
}
