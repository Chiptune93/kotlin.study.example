package `Part3-FuntionDefineAndCall`

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    // Button은 View를 확장했기 때문에 View의 하위 타입이다.
    // View 타입 변수를 선언해도 Button에 대입이 가능하며, Button이 오버라이드한 Click이 호출된다.
    override fun click() = println("Button clicked")
}

fun main() {
    val view: View = Button() // View 타입으로 지정되었지만, Button()이 대입되었으므로.
    view.click() // Button에서 오버라이드한 Click()이 호출됨.
}
