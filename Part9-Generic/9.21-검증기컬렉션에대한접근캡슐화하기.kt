import kotlin.reflect.KClass

object Validators {
    // 앞 예제와 같은 맵을 사용하지만 외부에서 접근할 수 없다.
    private val validators =
        mutableMapOf<KClass<*>, FieldValidator<*>>()

    fun <T : Any> registerValidator(
        kClass: KClass<T>, fieldValidator: FieldValidator<T>
    ) {
        // 어떤 클래스와 검증기가 타입이 맞아 떨어지는 경우에만 그 클래스와 검증기 정보를 맵에 키 값 쌍으로 넣는다.
        validators[kClass] = fieldValidator
    }
    // 캐스팅이 안전하지 않다는 정보를 무시하게 한다.
    @Suppress("UNCHECKED_CAST")
    operator fun <T : Any> get(kClass: KClass<T>): FieldValidator<T> =
        validators[kClass] as? FieldValidator<T>
            ?: throw IllegalArgumentException(
                "No validator for ${kClass.simpleName}"
            )
}

fun main() {
    Validators.registerValidator(String::class, DefaultStringValidator)
    Validators.registerValidator(Int::class, DefaultIntValidator)
    println(Validators[String::class].validate("kotlin"))
    println(Validators[Int::class].validate(42))
}
