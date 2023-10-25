package `Part4-ClassObjectInterface`

class PersonData(val name: String) {
    companion object Loader { // 이렇게 동반 객체에 이름을 붙일 수 있다.
        fun fromJson(jsonText: String) = println(jsonText)
    }
}

fun main() {
    PersonData.Loader.fromJson("{name: 'Alice'}") // 이렇게 사용한다.
}
