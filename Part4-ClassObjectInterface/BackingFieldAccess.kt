package `Part4-ClassObjectInterface`

class UserBFA(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent()) // 뒷받침 하는 필드 값 읽기
            field = value // 뒷받침하는 필드 값 변경하기.
        }
}

fun main() {
    val user = UserBFA("Alice")
    // 프로퍼티의 값을 바꿀 때, 필드 설정하는 것처럼 사용한다. 내부적으로는 setter 호출하는 것임.
    user.address = "서울시 강동대로 51길 12"
}
