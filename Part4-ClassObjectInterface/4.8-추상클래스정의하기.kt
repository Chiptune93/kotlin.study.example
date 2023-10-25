package `Part4-ClassObjectInterface`

abstract class Animate { // 추상 클래스. 인스턴스를 만들 수 없다.
    abstract fun animate() // 추상 함수, 구현이 없다. 하위 클래스에서는 반드시 오버라이드 해야 한다.

    // 추상 클래스에 속하더라도, 비추상함수는 기본적으로 final 이지만, 원하면 open으로 허용할 수 있음.
    open fun stopAnimating() {}
    fun animateTwice() {}
}
