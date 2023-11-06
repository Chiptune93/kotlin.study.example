class Person7 {
    // 추가 정보
    private val _attributes = hashMapOf<String, String>()
    fun setAttributes(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    // 필수 정보
    val name: String
        get() = _attributes["name"]!! // 수동으로 맵에서 정보를 꺼낸다.
}

fun main() {
    val p = Person7()
    val data = mapOf("name" to "Dimitry", "company" to "Jetbrains")
    for ((attrName, value) in data)
        p.setAttributes(attrName, value)
    println(p.name)
}
