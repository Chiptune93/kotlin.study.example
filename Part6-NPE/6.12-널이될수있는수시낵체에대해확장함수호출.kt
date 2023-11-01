package `Part6-NPE`

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) { // 안전한 호출을 하지 않아도 됨.
        println("Please Fill in the required fields")
    }
}

fun main() {
    verifyUserInput(" ")
    verifyUserInput(null) // isNullOrBlank에 "null"을 수신 객체로 전달해도 아무런 예외가 발생하지 않는다.
}
