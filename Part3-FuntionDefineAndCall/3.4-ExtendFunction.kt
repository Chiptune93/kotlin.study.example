package `Part3-FuntionDefineAndCall`

fun <T> Collection<T>.extendJoinToString( // Collection<T>에 대한 확장함수.
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) { // this 는 수신 객체를 가리킨다. 여기서는 T 타입을 가리킨다.
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join( // 문자열 컬렉션에서만 호출할 수 있는 join 함수 정의.
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
) = extendJoinToString(separator, prefix, postfix)

fun main() {
    val list = listOf(1, 2, 3)
    val list2 = listOf("1", "2", "3")
    println(list.extendJoinToString(separator = "; ", prefix = "(", postfix = ")"))
    // 에러!
    // println(list.join(separator = "; ", prefix = "(", postfix = ")"))
    // 동작함.
    println(list2.join(separator = "; ", prefix = "(", postfix = ")"))
}
