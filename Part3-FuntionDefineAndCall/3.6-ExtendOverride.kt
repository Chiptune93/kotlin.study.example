package `Part3-FuntionDefineAndCall`

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main() {
    // view 가 가리키는 실제 타입은 버튼이지만, 타입이 View라서 확장 함수는 view가 호출된다.
    val view: View = Button()
    view.showOff()
}
