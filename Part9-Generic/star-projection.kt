import kotlin.random.Random

fun main() {
    val list: MutableList<Any?> = mutableListOf('a',1,"qwe")
    val chars = mutableListOf('a','b','c')
    // MutableList<*>는 MutableList<Any?>와 같지 않다.
//    val unknownElements: MutableList<*> =
//        if (Random().nextBoolean()) list else chars

    // 컴파일러는 이 메소드 호출을 금지한다.
    // unknownElements.add(42)

    // 원소를 가져와도 안전하다. first()는 Any? 타입의 원소를 반환한다.
    //println(unknownElements.first())
}
