fun serializerForType(type: Type): ValueSerializer<out Any?>? =
    when(type) {
        Byte::class.java -> ByteSerializer
        Int::class.java -> IntSerializer
        Boolean::class.java -> BooleanSerializer
        // ...
        else -> null
    }
