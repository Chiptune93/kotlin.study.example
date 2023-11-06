data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) { // set을 정의한다.
    when (index) { // 해당 하는 좌표를 찾는다.
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("Invaild coordinate $index")
    }
}

fun main() {
    val p = MutablePoint(10, 20)
    p[1] = 42
    println(p)
    // MutablePoint(x=10, y=42)
}