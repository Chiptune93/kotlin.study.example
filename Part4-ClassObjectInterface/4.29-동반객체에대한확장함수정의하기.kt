package `Part4-ClassObjectInterface`

class Person2(val fiestName: String, val lastName: String) {
    companion object { // 비어있는 동반 객체를 선언한다.

    }
}

fun Person2.Companion.fromJson(json: String): Person { // 확장 함수를 선언한다.
    /**/
    return TODO("반환 값을 제공하세요")
}

fun main() {
    // 동반객체안에서 fromJson을 정의한 것 처럼 호출할 수 있다.
    // 실제로는 멤버함수가 아니다.
    val json = "{'json':'json123'}"
    val p = Person2.fromJson(json)
}
