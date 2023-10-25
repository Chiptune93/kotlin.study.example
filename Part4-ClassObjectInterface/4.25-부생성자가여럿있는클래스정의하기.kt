package `Part4-ClassObjectInterface`

class User1 {
    val nickname: String

    constructor(email: String) { // 부생성자
        nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) { // 부생성자
        nickname = getFacebookName(facebookAccountId)
    }

    // 오류 없애기 위해 간단하게 구현.
    private fun getFacebookName(facebookAccountId: Int): String {
        return "name"
    }
}
