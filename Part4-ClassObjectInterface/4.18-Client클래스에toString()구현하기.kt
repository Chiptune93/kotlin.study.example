package `Part4-ClassObjectInterface`

class Client1(val name: String, val postalCode: Int) {
    override fun toString(): String = "Client(name=$name, postalCode=$postalCode"
}

fun main() {
    val client1 = Client1("오현석", 4122)
    println(client1)
}
