class ObjectSeed<out T: Any> (
    targetClass: KClass<T>,
    val classInfoCache: ClassInfoCache
): Seed {
    // targetClass의 인스턴스를 만들 때 필요한 정보를 캐싱한다.
    private val classInfo: ClassInfo<T> =
        classInfoCache[targetClass]
    private val valueArguments = mutableMapOf<KParameter, Any?>()
    private val seedArguments = mutableMapOf<KParameter, Seed>()
    private val arguments: Map<KParameter, Any?> // 생성자 파라미터와 그 값을 연결하는 맵을 만든다.
        get() = valueArguments +
                seedArguments.mapValues { it.value.spawn() }

    override fun setSimpleProperty(propertyName: String, value: Any?) {
        val param = classInfo.getConstructorPrarmeter(propertyName)
        valueArguments[param] = // 널 생성자 파라미터 값이 간단한 값인 경우 그 값을 기록한다.
            classInfo.deserializeConstructorArgument(param, value)
    }

    override fun createCompositeProperty(propertyName: String, isList: Boolean): Seed {
        val param = classInfo.getConstructorParameter(propertyName)
        val deserializeAs = // 프로퍼티에 대한 애노테이션이 있다면 그 값을 가져온다.
            classInfo.getDeserializeClass(propertyName)
        val seed = createSeedForType( // 파라미터 타입에 따라 ObjectSeed나 CollectionSeed를 만든다.
            deserializeAs ?: param.type.javaType, isList
        )
        // 만든 시드 객체를 seedArguments 맵에 기록한다.
        return seed.apply { seedArguments[param] = this}
    }
    // 인자 맵을 넘겨서 targetClass 타입의 인스턴스를 만든다.
    override fun spawn(): T =
        classInfo.createInstance(arguments)
}
