operator fun Point.get(index: Int): Int { // get 연산자를 정의한다.
    return when (index) { // 주어진 인덱스에 해당하는 좌표를 찾는다.
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main() {
    val p = Point(10, 20)
    println(p[1])
}