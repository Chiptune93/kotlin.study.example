interface JsonObject {
    // 프로퍼티 유형에 따른 JsonObject 함수 호출.
    fun setSimpleProperty(propertyName: String, value: Any?)
    fun createObject(propertyName: String): JsonObject
    fun createArray(propertyName: String): JsonObject
}
