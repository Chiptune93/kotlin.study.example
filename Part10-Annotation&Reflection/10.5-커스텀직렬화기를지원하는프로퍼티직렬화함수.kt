private fun StringBuilder.serializeProperty(
    prop: KProperty1<Any,*>, obj: Any
) {
    val name = prop.findAnnotation<JsonName>)()?.name ?: prop.name
    serializeString(name)
    append(": ")
    val value = prop.get(obj)
    val jsonValue =
        prop.getSerializer()?.toJsonValue(value)
    // 프로퍼티에 대해 정의된 커스텀 직렬화기가 있으면 그 커스텀 직렬화기를 사용한다.
}
