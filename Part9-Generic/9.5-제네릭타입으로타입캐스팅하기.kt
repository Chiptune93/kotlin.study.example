fun printSum(c: Collection<*>) {
    val intList = c as? List<Int> // 여기서 Unchecked cast: List<*> to List<Int> 가 발생한다.
        ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun main() {
    // 경고는 발생했지만 예상대로 실행된다.
    printSum(listOf(1, 2, 3))
    // 집합은 List가 아니므로 예외가 발생한다.
    printSum(setOf(1, 2, 3))
    // as? 캐스팀은 성공하지만 나중에 다른 예외가 발생한다.
    printSum(listOf("a", "b", "c"))
}
