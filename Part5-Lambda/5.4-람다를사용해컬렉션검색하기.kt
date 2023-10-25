package `Part5-Lambda`

// 나이 프로퍼티를 비교해서 가장 값이 큰 원소 찾기
fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy { it.age })
}
