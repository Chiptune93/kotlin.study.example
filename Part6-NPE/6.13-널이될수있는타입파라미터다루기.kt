package `Part6-NPE`

fun <T> printHashCode(t: T) {
    println(t?.hashCode()) // t가 null이 될 수 있으므로 안전한 호출을 사용해야 한다.
}

fun main() {
    printHashCode(null) // t의 타입은 Any?로 추론된다.
}
