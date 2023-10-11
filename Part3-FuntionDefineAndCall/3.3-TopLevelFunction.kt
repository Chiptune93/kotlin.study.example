@file:JvmName("StringFunctions") // 파일에 대응하는 클래스의 이름 변경하기. StringFunctions.topLevelJoinString()... 으로 호출할 수 있다.
package `Part3-FuntionDefineAndCall`

fun <T> topLevelJoinString(
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

// ... in Java ...
//import packages.Joinkt;
//
//JoinKt.topLevelJoinString(list, ", ", "","");


