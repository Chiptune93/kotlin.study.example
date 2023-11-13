// reified 키워드는 이 타입 파라미터가 실행 시점에 지워지지 않음을 표시한다.
inline fun <reified T>
        Iterable<*>.filterIsInstance2(): List<T> {
    val destination = mutableListOf<T>()
    for (element in this) {
        // 각 원소가 타입 인자로 지정한 클래스의 인스턴스인지 검사할 수 있다.
        // reified 키워드를 지우면 컴파일러에서 " Cannot check for instance of erased type: T " 를 반환한다.
        if (element is T) {
            destination.add(element)
        }
    }
    return destination
}

fun main() {
    val items2 = listOf("abc", 123, "DSASD")
    println(items2.filterIsInstance2<String>())
}
