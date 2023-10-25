package `Part4-ClassObjectInterface`

class Client3(val name: String, val postalCode: Int) {
    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

fun main() {
    val proceed = hashSetOf(Client3("오현석", 4122))
    println(proceed.contains(Client3("오현석", 4122)))
}
