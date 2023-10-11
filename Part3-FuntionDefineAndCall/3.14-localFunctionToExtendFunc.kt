package `Part3-FuntionDefineAndCall`


class User4(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() { // User 객체의 확장함수로 선언
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                    "Can't save user ${id}: empty $fieldName"
            )
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

fun saveUsers(user: User) {
    user.validateBeforeSave()

    // DB에 유저를 저장하는 다음 프로세스 ...
}

fun main() {
    saveUser(User(1, "", ""))
}
