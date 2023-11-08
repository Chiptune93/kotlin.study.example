data class Person1(val name: String, val age: Int)

fun main() {
    val people = listOf(Person1("Alice", 29), Person1("Bob", 31))
    println(people.filter { it.age < 30 })
}
