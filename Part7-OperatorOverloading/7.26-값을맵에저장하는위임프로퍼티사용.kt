class Person8 {
    // 추가 정보
    private val _attributes = hashMapOf<String, String>()
    fun setAttributes(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    // 필수 정보
    val name: String by _attributes
}

fun main() {
    val p = Person8()
    val data = mapOf("name" to "Dimitry", "company" to "Jetbrains")
    for ((attrName, value) in data)
        p.setAttributes(attrName, value)
    println(p.name)
}
