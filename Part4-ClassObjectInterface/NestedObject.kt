package `Part4-ClassObjectInterface`

// 중첩객체를 사용해 Comparator 구현하기.
data class Person(val name: String) {
    // 중첩객체인 NameComparator 생성, Comparator<Person> 를 구현했다.
    object NameComparator : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int = o1.name.compareTo(o2.name)
    }
}

fun main() {
    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
}
