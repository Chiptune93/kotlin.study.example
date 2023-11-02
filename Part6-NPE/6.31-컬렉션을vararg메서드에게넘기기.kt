package `Part6-NPE`

fun main(args: Array<String>) {
    val strings = listOf("a", "b", "c")
    // vararg 인자를 넘기기 위해 스프레드 연산자(*)를 써야 한다.
    println("%s/%s/%s".format(*strings.toTypedArray()))
}
