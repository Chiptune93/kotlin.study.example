// 인라인 함수로 만들고, reified 타입 파라미터를 지정하면 value 타입이 T 타입인지 실행 시점에 검사할 수 있다.
inline fun <reified T> isA(value: Any) = value is T
fun main() {
    println(isA<String>("abc"))
    println(isA<String>(123))
}
