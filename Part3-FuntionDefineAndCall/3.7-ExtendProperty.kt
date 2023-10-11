package `Part3-FuntionDefineAndCall`

val String.lastChar: Char
    get() = get(length - 1)

fun main() {
    println("123".lastChar)
}
