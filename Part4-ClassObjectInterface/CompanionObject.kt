package `Part4-ClassObjectInterface`

//class UserCompanion {
//    val nickname: String
//
//    constructor(email: String) {
//        nickname = email.substringBefore('@')
//    }
//
//    constructor(facebookAccountId: Int) {
//        nickname = getFaceBookName(facebookAccountId)
//    }
//}

// 위 소스를 아래와 같이 private 접근 제어자를 이용해 동반 객체를 생성하여 메서드를 호출하게 한다.

// 부 생성자를 팩토리 메서드로 대신하기
class UserCompanion private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = UserCompanion(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = UserCompanion(getFacebookName(accountId))

        private fun getFacebookName(accountId: Int): String = accountId.toString()
    }
}

fun main() {
    val subscribingUser = UserCompanion.newSubscribingUser("bob@gmail.com")
    val facebookUser = UserCompanion.newFacebookUser(4)
    println(subscribingUser.nickname)
}
