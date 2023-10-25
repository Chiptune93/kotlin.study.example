package `Part5-Lambda`

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    val names = people.joinToString(separator = " ", transform = { p: Person -> p.name })
}
