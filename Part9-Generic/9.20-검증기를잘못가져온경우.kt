import kotlin.reflect.KClass

fun main() {
    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    // 검증기를 실수로 잘못 가져왔지만 캐스팅에는 문제가 없다.
    val stringValidator = validators[Int::class] as FieldValidator<String>
    // 검증기를 사용할 때 오류가 발생한다.
    // Exception in thread "main" java.lang.NullPointerException:
    // null cannot be cast to non-null type <root>.FieldValidator<kotlin.String>
    stringValidator.validate("")
}
