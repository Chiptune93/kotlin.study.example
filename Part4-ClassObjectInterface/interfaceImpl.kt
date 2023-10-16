package `Part4-ClassObjectInterface`

class Button : Clickable, Focusable {
    override fun click() {
        println("I was clicked")
    }
    // 이름과 시그니처가 같은 멤버 메서드에 대해 둘 이상의 디폴트 구현이 있는 경우
    // 인터페이스를 구현하는 하위 클래스에서 명시적으로 새롭게 구현해야 한다.
    override fun showOff() {
        // 상위 타입의 이름을 <>로 넣어 super를 지정하면
        // 어떤 상위 타입의 멤버 메소드를 호출할 지 지정할 수 있다.
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main() {
    Button().click()

    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.showOff()
}
