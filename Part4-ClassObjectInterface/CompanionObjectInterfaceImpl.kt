package `Part4-ClassObjectInterface`

interface JSONFactory<T> {
    fun fromJson(jsonText: String): T
}

class PersonImpl(val name: String) {
    companion object : JSONFactory<PersonImpl> { // 동반 객체가 인터페이스를 구현한다.
        override fun fromJson(jsonText: String): PersonImpl {
            TODO("Not yet implemented")
        }
    }
}
