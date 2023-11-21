private fun StringBuilder.serializeObject(obj: Any) {
    val kClass = obj.javaClass.kotlin // 객체의 kclass를 얻는다.
    val properties = kClass.memberProperties // 클래스의 모든 프로퍼티를 얻는다.
    properties.joinToStringBuilder(
        this, prefix = "{", postfix = "}"
    ) { prop ->
        serializeString(prop.name) // 프로퍼티의 이름을 얻는다.
        append(": ")
        serializePropertyValue(prop.get(obj)) // 프로퍼티의 값을 얻는다.
    }
}

// 이 클래스는 리플렉션을 어떻게 활용하는가에 대한 예제를 보여준다.
// 특정 값이 아닌 클래스의 모든 멤버를 묶는 또는 사용하는 작업을 할 때를 보여준다.
