package `Part6-NPE`

// 널이아니면 좌항, 널이면 우항
fun strLenSafe2(s: String?): Int = s?.length ?: 0

fun main() {
    val x: String? = null
    println(strLenSafe2(x))
    println(strLenSafe2("abc"))
}
