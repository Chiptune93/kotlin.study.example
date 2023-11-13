fun main() {
    val letters = ('a'..'z').toList()
    // 타입 인자를 명시적으로 지정한다.
    println(letters.slice<Char>(0..2))
    // 컴파일러는 여기서 T가 Char라는 사실을 추론한다.
    println(letters.slice<Char>(10..13))
}
