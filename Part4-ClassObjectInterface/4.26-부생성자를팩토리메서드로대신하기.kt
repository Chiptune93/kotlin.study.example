package `Part4-ClassObjectInterface`

class User2 private constructor(val nickname: String) { // 주 생성자를 비공개로 만든다.
    companion object { // 동반객체를 선언한다.
        fun newSubcribingUser(email: String) =
            User2(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) = // 페이스북 아이디로 사용자를 만드는 팩토리 메서드가 된다.
            User2(getFacebookName(accountId))

        private fun getFacebookName(accountId: Int): String {
            return "name"
        }
    }
}
