package `Part5-Lambda`

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    // 전체 컬렉션에 연산을 적용
    people.map(Person::name).filter { it.startsWith("A") }

    // 지연 계산은 원소를 한번에 하나씩 처리 -> 그러다 결과 있으면 리턴.
    people.asSequence()
            .map(Person::name)
            .filter { it.startsWith("A") }
            .toList()
}
