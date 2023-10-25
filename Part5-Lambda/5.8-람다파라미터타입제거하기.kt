package `Part5-Lambda`

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    people.maxBy { p: Person -> p.age }
    people.maxBy { p -> p.age }
}
