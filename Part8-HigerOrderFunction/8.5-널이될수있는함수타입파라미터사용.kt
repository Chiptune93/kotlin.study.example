fun <T> Collection<T>.joinToString3(
    spearator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    // 널이 될 수 있는 함수 타입의 파라미터 선언
    transform: ((T) -> String)? = null
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(spearator)
        // 안전 호출을 사용해 함수를 호출 한다.
        val str = transform?.invoke(element)
        // 엘비스 연산자를 사용해 람다를 인자로 받지 않은 경우를 처리한다.
            ?: element.toString()
        result.append(str)
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    val letters = listOf("Alpha", "Beta")
    println(letters.joinToString())
    println(
        letters.joinToString3(
            spearator = "! ", postfix = "! "
        )
    )
}
