private fun StringBuilder.serializeObject(obj: Any) {
     obj.javaClass.Kotlin.memberProperties
         .filter { it.findAnnotation<JsonExclude>() == null } // 특정 어노테이션 필터링
         .joinToStringBuilder(this, prefix = "{", postfix = "}") {
             serializeProperty(it, obj)
         }
}
