fun lookForAlice3(people: List<Person1>) {
    people.forEach label@{ // 람다 식 앞에 레이블을 붙인다.
        // return@label은 앞에서 정의한 레이블을 참조한다.
        if (it.name == "Alice") return@label
    }
    // 항상 이 줄이 출력된다.
    println("Alice might be somewhere")
}

fun main() {
    lookForAlice3(people)
}
