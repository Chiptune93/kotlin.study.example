import java.lang.Appendable

fun <T> ensureTrailingPeriod(seq: T)
// 타입 파라미터 제약 목록이다.
        where T : CharSequence, T : Appendable {
    // CharSequence 인터페이스의 확장 함수를 호출 한다.
    if (!seq.endsWith('.')) {
        // Appendable 인터페이스의 메서드를 호출 한다.
        seq.append('.')
    }
}

fun main() {
    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)
}
