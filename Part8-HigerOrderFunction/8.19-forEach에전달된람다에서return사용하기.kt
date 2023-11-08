fun lookForAlice2(people: List<Person1>) {
    people.forEach {
        if (it.name == "Alice") {
            println("Found")
            // 8.18과 마찬가지로 lookForAlice 함수에서 반환된다.
            return
        }
    }
    println("Alice is not found")
}

fun main() {
    lookForAlice2(people)
}
