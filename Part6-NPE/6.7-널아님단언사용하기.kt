package `Part6-NPE`

fun ignoreNulls(s: String?) {
    // 단언을 사용한 부분에서 에러가 발생한다. -> "나는 이 값이 널이 아님을 잘 알고 있다. 내가 잘못 생각했다면 예외가 발생해도 감수하겠다!"
    val sNotNull: String = s!!
    // 실제 사용한건 아래 코드인데, 위에서 에러가 난다.
    println(sNotNull.length)
}

fun main() {
    ignoreNulls(null)
}

//Exception in thread "main" java.lang.NullPointerException
//at Part6-NPE._6_7_널아님단언사용하기Kt.ignoreNulls(6.7-널아님단언사용하기.kt:4)
//at Part6-NPE._6_7_널아님단언사용하기Kt.main(6.7-널아님단언사용하기.kt:9)
//at Part6-NPE._6_7_널아님단언사용하기Kt.main(6.7-널아님단언사용하기.kt)
