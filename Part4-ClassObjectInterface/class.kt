package `Part4-ClassObjectInterface`

open class RichButton: Clickable { // 열린 클래스, 다른 클래스가 이 클래스를 상속할 수 있다.
    fun disable() {}  // 이 함수는 파이널이다. 하위 클래스가 이 메서드를 오버라이드 할 수 없다.
    open fun animate() {} // 이 함수는 열려있다. 하위 클래스에서 오버라이드를 할 수 있다.
    override fun click() {} // 이 함수는 상위 클래스에서 선언된 열린 메서드를 오버라이드 한다. 오버라이드 한 메서드는 기본적으로 열려있는 상태다.
    // final override fun click() {} // 오버라이드 금지하기. 여기 있는 파이널은 중복이 아니다. 파이널이 없는 오버라이드 메서드나 프로퍼티는 기본적으로 열린 상태이다.
}
