fun <T : R, R> copyData2(source: MutableList<T>, destination: MutableList<R>) {
    // source의 원소타입은 destination 원소 타입의 하위 타입이어야 한다.
    for (item in source) {
        destination.add(item)
    }
}

fun main() {
    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyData2(ints, anyItems)
    println(anyItems)
}