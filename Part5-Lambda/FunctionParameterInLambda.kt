package `Part5-Lambda`

fun printMessageWithPrefix(message: Collection<String>, prefix: String) {
    message.forEach { println("$prefix $it") } // 파라미터를 람다안에서 직접 사용할 수 있다.
}

fun main() {
    val errors = listOf("403 forbidden", "404 not found")
    printMessageWithPrefix(errors,"Error : ")
}
