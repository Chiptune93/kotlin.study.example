package `Part5-Lambda`

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    // 파라미터 이름을 따로 지정하지 않은 경우에만 it이 자동으로 만들어진다.
    people.maxBy { it.age }
}
