package `Part5-Lambda`

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    // 멤버 참조를 통해 검색한다.
    people.maxBy(Person::age)
}
