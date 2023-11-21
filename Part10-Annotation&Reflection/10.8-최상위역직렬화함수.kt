fun <T: Any> deserialize(json: Reader, tragetClass: KClass<T>):T {
    val seed = ObjectSeed(targetClass, ClassInfoCache()) // 클래스 인스턴스 생성을 도와주는 캐시 도우미 클래스.
    Parser(json, seed).parse()
    return seed.spawn()
}
