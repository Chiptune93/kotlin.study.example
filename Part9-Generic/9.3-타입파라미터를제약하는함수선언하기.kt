fun <T : Comparable<T>> max(first: T, second: T): T {
    // 이 함수의 인자들은 비교가능해야 한다.
    return if (first > second) first else second
}

fun main() {
    // 문자열을 알파벳순으로 비교한다.
    println(max("kotlin", "java"))
    // 비교할 수 없는 타입에서는 컴파일 오류가 발생한다.
    // println(max("kotlin", 42))
}
