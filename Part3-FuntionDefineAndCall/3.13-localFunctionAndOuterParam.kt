package `Part3-FuntionDefineAndCall`

class User3(val id: Int, val name: String, val address: String)

// 필드 검증 중복이 발생하는 코드
fun saveUser3(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException( // validate 함수 바깥의 User에 접근할 수 있다!
                    "Can't save user ${user.id}: empty $fieldName"
            )
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
}

fun main() {
    saveUser3(User(1, "", ""))
}
