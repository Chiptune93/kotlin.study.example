import java.lang.StringBuilder

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    // 0부터 수신 객체 스트링의 길이까지 반복한다.
    for (index in 0 until length) {
        val element = get(index)
        // predicate 파라미터로 전달받은 함수를 호출한다.
        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}

fun main() {
    println("ab1c".filter { it in 'a'..'z' })
}
