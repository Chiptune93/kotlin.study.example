fun lookForAlice5(people: List<Person1>) {
    people.forEach(fun(person) { // 람다 식 대신 무명 함수를 사용한다.
        // return은 가장 가까운 함수를 가리키는데 이 위치에서 가장 가까운 함수는 무명함수이다.
        if (person.name == "Alice") return
        println("${person.name} is not Alice")
    })
}

fun main() {
    lookForAlice3(people)
}
