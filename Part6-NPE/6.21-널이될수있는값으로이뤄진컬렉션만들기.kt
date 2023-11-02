package `Part6-NPE`

import java.io.BufferedReader
import java.lang.NumberFormatException

fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>() // 널이 될 수 있는 Int 값으로 이뤄진 리스트를 만든다.
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number) // 정수를 리스트에 추가한다.
        } catch (e: NumberFormatException) {
            result.add(null) // 현재 줄을 파싱할 수 없으므로 리스트에 널을 추가한다.
        }
    }
    return result
}
