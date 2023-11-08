val people = listOf(Person1("Alice", 29), Person1("Bob", 31))
fun lookForAlice(people: List<Person1>) {
    for (person in people) {
        if (person.name == "Alice") {
            println("Found!")
            // 이름이 alice인 경우에 lookForAlice 함수로부터 반환이 이루어진다는 사실을
            // 명확히 알 수 있다.
            return
        }
        println("Alice is not found")
    }
}

fun main() {
    lookForAlice(people)
}
