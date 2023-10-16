package `Part4-ClassObjectInterface`

interface User {
    val nickname: String
}

// 주 생성자에 있는 프로퍼티
// User의 추상 프로퍼티를 구현하고 있으므로 오버라이드 표시를 해야 한다.
class PrivateUser(override val nickname: String) : User

// 커스텀 게터로 nickname 프로퍼티를 설정한다.
// 뒷받침하는 필드에 값을 저장하지 않고 매번 이메일 주소에서 별명을 계산해 반환한다.
class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@') // 커스텀 게터
}

// 초기화 식으로 nickname 값을 초기화 한다.
// 객체를 초기화 하는 단계에 1번만 호출하도록 설계되었다.
class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId) // 프로퍼티 초기화 식

    private fun getFacebookName(accountId: Int): String = accountId.toString()
}
