package `Part3-FuntionDefineAndCall`

class User2(val id: Int, val name: String, val address: String)

// 필드 검증 중복이 발생하는 코드
fun saveUser2(user: User) {
    fun validate(user: User, value: String,
                 fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                    "Can't save user ${user.id}: empty $fieldName"
            )
        }
    }
//    if (user.name.isEmpty()) {
//        throw IllegalArgumentException(
//                "Can't save user ${user.id} : empty Name"
//        )
//    }
//
//    if (user.address.isEmpty()) {
//        throw IllegalArgumentException(
//                "Can't save user ${user.id} : empty Address"
//        )
//    }
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

fun main() {
    saveUser2(User(1, "", ""))
}
