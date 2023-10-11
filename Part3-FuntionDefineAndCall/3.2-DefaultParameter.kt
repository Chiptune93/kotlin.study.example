package `Part3-FuntionDefineAndCall`

// 컬렉션의 원소를 StringBuilder 뒤에 덧붙인다.
// 이 때, 구분자를 추가하고 맨 앞과 뒤에 접두사와 접미사를 붙인다.
fun <T> joinToStringWithDefaultParameter(
        collection: Collection<T>,
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    val list = listOf(1, 2, 3)
    println(joinToStringWithDefaultParameter(list, "; ", "(", ")"))
    println(joinToStringWithDefaultParameter(list))
    println(joinToStringWithDefaultParameter(list, postfix = ";", prefix = "# "))
}
