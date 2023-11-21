private fun StringBuilder.serializeProperty(
    prop: KProperty1<Any,*>, obj: Any
) {
    val jsonNameAnn = prop.findAnnotation<JsonName>() // JsonName에 따라 이름을 처리
    val propName = jsonNameAnn?.name ?: prop.name
    serializeString(propName)
    append(": ")
    serializePropertyValue(prop.get(obj))
}
