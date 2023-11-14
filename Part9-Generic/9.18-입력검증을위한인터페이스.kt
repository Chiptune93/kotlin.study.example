import kotlin.reflect.KClass

interface FieldValidator<in T> { // T에 대해 반공변인 인터페이스를 선언한다.
    // T를 in 위치에만 사용한다(이 메서드는 T 타입의 값을 소비한다.)
    fun validate(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String> {
    override fun validate(input: String) = input.isNotEmpty()
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int) = input >= 0
}

fun main() {
    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator
    // Kotlin: Type mismatch: inferred type is String but Nothing was expected
    // validators[String::class]!!.validate("")
}
