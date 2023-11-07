data class Person(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String?
)

class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    // 함수를 반환하는 함수를 정의한다.
    // 여기서는 Person을 받아 Boolean을 리턴하는 함수를 리턴한다.
    fun getPredicate(): (Person) -> Boolean {
        // 리턴될 함수를 변수에 저장한다.
        val startWithPrefix = { p: Person ->
            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }
        // 번호가 있으면 함수를 그대로 리턴
        if (!onlyWithPhoneNumber) {
            return startWithPrefix
        }
        // 번호가 없으면 재정의한 함수를 리턴
        return { startWithPrefix(it) && it.phoneNumber != null }
    }
}

fun main() {
    val contacts = listOf(Person("Dmitry", "Jemerov", "123-4567"), Person("Svetlana", "Isakova", null))
    val contactListFilters = ContactListFilters()
    with(contactListFilters) {
        prefix = "Dm"
        onlyWithPhoneNumber = true
    }
    println(contacts.filter(contactListFilters.getPredicate()))
}
