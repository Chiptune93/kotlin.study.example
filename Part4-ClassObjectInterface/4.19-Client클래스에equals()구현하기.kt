package `Part4-ClassObjectInterface`

class Client2(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client2)
            return false
        return name == other.name && postalCode == other.postalCode
    }

    override fun toString(): String = "Client(name=$name, postalCode=$postalCode"
}

