class ClassInfo<T: Any>(cls: KClass<T>) {
    private val constructor = cls.primaryConstructor!!
    private val jsonNameToParam = hashMapOf<String, KParameter>()
    private val paramToSerializer =
        hashMapOf<KParameter, ValueSerializer<out Any?>>()
    private val jsonNameToDeserializeClass =
        hashMapOf<String, Class<out Any>?>()

    init {
        constructor.parameters.forEach { cacheDataForParameter(cls, it) }
    }
    fun getConstructorParameter(propertyName: String) : KParameter =
        jsonNameToParam[propertyName]!!
    fun deserializeConstructorArgument(
        param: KParameter, value: Any?):Any? {
        val serializer = paramToSerializer[param]
        if(serializer != null) return serializer.fromJsonValue(value)
        validateArgumentType(param,value)
        return value
    }
    fun createInstance(arguments: Map<KParameter, Any?>: T {
        ensureAllParametersPresent(arguments)
        return constructor.callBy(arguments)
    }
    // ...
}
