package `Part6-NPE`

class Person2(val firstName: String, val lastName: String) {
    override fun equals(o: Any?): Boolean {
        // 타입이 서로 일치하지 않으면 false를 반환한다.
        val otherPerson = o as? Person2 ?: return false
        // 안전한 캐스트를하고 나면 otherPersion이 Person2 타입으로 태스트 된다.
        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int =
        firstName.hashCode() * 37 + lastName.hashCode()
}

fun main() {
    val p1 = Person2("Dmitry", "Jemerov")
    val p2 = Person2("Dmitry", "Jemerov")
    println(p1 == p2) // == 연산자는 equals를 호출한다.
    println(p1.equals(p2))
}
