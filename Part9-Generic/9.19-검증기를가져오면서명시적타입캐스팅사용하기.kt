import kotlin.reflect.KClass

fun main() {
    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    // Unchecked cast: FieldValidator<*>? to FieldValidator<String>
    val stringValidator = validators[String::class] as FieldValidator<String>
    println(stringValidator.validate(""))
    // false
}
