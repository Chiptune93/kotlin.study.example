// seed 는 빌더와 비슷하다고 보면 된다.
interface Seed : JsonObject {
    // 빌더와 비슷하게 spawn도 만든 객체를 돌려주지만, spawn은 ObjectSeed 의 경우 생성된 객체를 반환하고
    // ObjectListSeed 나 ValueListSeed의 경우, 생성된 리스트를 반환한다.
    fun spawn(): Any?
    fun createCompositeProperty(
        propertyName: String,
        isList: Boolean
    ): JsonObject

    override fun createObject(propertyName: String) =
        createCompositeProperty(propertyName, false)

    override fun createArray(propertyName: String) =
        createCompositeProperty(propertyName, true)
}
