fun <T> Collection<T>.joinToString(
    spearator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(spearator)
        // 기본 toString() 메서드를 사용해 객체를 문자열로 반환한다.
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
