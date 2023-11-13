fun printSum2(c: Collection<Int>) {
    // 이 검사는 올바르다.
    if (c is List<Int>) {
        println(c.sum())
    }
}

fun main() {
    // 경고는 발생했지만 예상대로 실행된다.
    printSum(listOf(1, 2, 3))
    // 집합은 List가 아니므로 예외가 발생한다.
    printSum(setOf(1, 2, 3))
    // as? 캐스팀은 성공하지만 나중에 다른 예외가 발생한다.
    printSum(listOf("a", "b", "c"))
}
