fun lookForAlice4(people: List<Person1>) {
    people.forEach {
        // return@forEach는 람다식으로부터 반환 시킨다.
        if (it.name == "Alice") return@forEach
    }
    println("Alice might be somewhere")
}

fun main() {
    lookForAlice3(people)
}
