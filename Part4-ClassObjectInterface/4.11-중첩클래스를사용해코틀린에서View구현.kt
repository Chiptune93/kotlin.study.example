package `Part4-ClassObjectInterface`

class Button2 : View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {}
    class ButtonState : State {} // 이 클래스는 자바의 정적 중첩 클래스와 대응한다.
}
