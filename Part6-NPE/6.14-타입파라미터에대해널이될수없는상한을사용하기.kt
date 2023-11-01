package `Part6-NPE`

fun <T : Any> printHashCode2(t: T) { // T는 널이 될 수 없다.
    println(t.hashCode())
}

fun main() {
    // printHashCode2(null) -> 이 코드는 컴파일이 불가능 함. 널이 될 수 없는 타입의 파라미터에 널을 넘기려고 했기 때문.
    printHashCode2(42)
}
