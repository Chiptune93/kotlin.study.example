//class Point(val x: Int, val y: Int) { // 이미 정의된 클래스가 있어 주석처리했다. 확장함수로 구현하나 오버라이딩하나 동일하다.
//override fun Point.equals(obj: Any?): Boolean {
fun Point.equals(obj: Any?): Boolean { // Any로 정의된 메서드 오버라이딩
    if (obj === this) return true // 최적화: 파라미터가 this와 같은 객체인지 살펴본다.
    if (obj !is Point) return false // 파리미터 타입을 검사한다.
    return obj.x == x && obj.y == y // Point로 스마트 캐스트해서 x와 y의 프로퍼티에 접근한다.
}
//}

fun main() {
    println(Point(10, 20) == Point(10, 20))
    println(Point(10, 20) != Point(5, 5))
    println(null == Point(1, 2))
}