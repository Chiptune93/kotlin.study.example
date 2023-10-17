package `Part5-Lambda`

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main() {
    // normal way
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    findTheOldest(people)

    /*------------------------------------------------------------------------*/
    /*------------------------------------------------------------------------*/

    // library
    println(people.maxBy { it.age })

    /*------------------------------------------------------------------------*/
    /*------------------------------------------------------------------------*/

    // 멤버 참조
    people.maxBy(Person::age)
}
