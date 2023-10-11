package `Part3-FuntionDefineAndCall`

class User(val id: Int, val name: String, val address: String)

// 필드 검증 중복이 발생하는 코드
fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException(
                "Can't save user ${user.id} : empty Name"
        )
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException(
                "Can't save user ${user.id} : empty Address"
        )
    }
}

fun main() {
    saveUser(User(1, "", ""))
}
