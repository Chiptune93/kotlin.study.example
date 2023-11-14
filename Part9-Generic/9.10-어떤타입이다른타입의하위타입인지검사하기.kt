fun test(i: Int) {
    var n: Number = i // Int가 Number의 하위타입이어서 컴파일 된다.
    fun f(s: String) { /**/
    }
    // f(i) // Int가 String의 하윕 타입이 아니어서 컴파일 되지 않는다.
}

fun main() {
    var a: Int? = 1
    var b: Int = 1
    println(a === b)
}