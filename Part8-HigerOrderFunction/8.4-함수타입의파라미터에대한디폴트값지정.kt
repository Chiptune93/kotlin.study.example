fun <T> Collection<T>.joinToString2(
    spearator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    // 함수 타입 파라미터를 선언하면서 람다를 디폴트 값으로 지정한다.
    transform: (T) -> String = { it.toString() }
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(spearator)
        // transform 파라미터로 받은 함수를 호출한다.
        result.append(transform(element))
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    val letters = listOf("Alpha", "Beta")
    println(letters.joinToString())
    println(letters.joinToString2(spearator = "! ", postfix = "! ",
        transform = { it.toUpperCase() }))
}
