data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point { // plus 라는 이름의 연산자 함수를 정의한다.
        return Point(x + other.x, y + other.y) // 좌표를 더한 새로운 좌표를 반환한다.
    }
}

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
}

//public static final void main() {
//    Point p1 = new Point(10, 20);
//    Point p2 = new Point(30, 40);
//    Point var2 = p1.plus(p2); // .plus로 변환된다.
//    System.out.println(var2);
//}
