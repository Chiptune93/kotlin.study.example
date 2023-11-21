private fun ensureAllParametersPresent(arguments: Map<KParameter, Any?>) {
    for(param in constructor.parameters) {
        // 디폴트 값이 있다면, param.isOptional이 true 다.
        // 파라미터가 널이 될 수 있는 값이라면 디폴트 파라미터로 null 을 사용한다.
        if(arguments[param] == null &&
            !param.isOptional && !param.type.isMarkedNullable) {
            throw JKidException("Missing value for parameter ${param.name}")
        }
    }
}
