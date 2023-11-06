class Persons(val name: String) {
    // 데이터를 저장하고 emails의 위임 객체 역할을 하는 프로퍼티
    private var _emails: List<Email>? = null
    val emails: List<Email>
        get() {
            if (_emails == null) {
                // 최초 접근 시 이메일을 가져온다.
                _emails = loadEmails(this)
            }
            // 저장해둔 데이터가 있으면 그걸 반환한다.
            return _emails!!
        }

    private fun loadEmails(persons: Persons): List<Email>? {
        return listOf(Email.ALICE, Email.JOHN)
    }

}

enum class Email {
    ALICE, JOHN
}

fun main() {
    val p = Persons("Alice")
    p.emails // load
    p.emails // not load
}
