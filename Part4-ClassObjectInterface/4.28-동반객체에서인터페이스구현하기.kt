package `Part4-ClassObjectInterface`

interface JSONFactory<T> {
    fun fromJson(jsonText: String): T
}

class PersonImpl(val name: String) {
    // JSONFactory가 인스턴스를 넘길때 클래스의 이름을 사용한다. -> 클래스의 동반 객체는 일반 객체와 비슷하게 인스턴스를 가리키는 정적필드로 컴파일된다.
    // 동반객체에 이름을 붙이지 않으면 자바 쪽에서 Companion이라는 이름으로 그 참조에 접근한다.
    companion object : JSONFactory<PersonImpl> { // 동반 객체가 인터페이스를 구현한다.
        override fun fromJson(jsonText: String): PersonImpl {
            TODO("Not yet implemented")
        }
    }
}
