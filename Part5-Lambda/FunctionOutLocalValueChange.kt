package `Part5-Lambda`

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0 // 람다 안에서 사용할 함수 로컬 변수
    var serverErrors = 0
    responses.forEach { // 람다 식 안에서 해당 로컬 변수를 사용 및 변경
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun main() {
    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)
}
