package `Part4-ClassObjectInterface`

// 데이터 클래스 메소드를 내부 구현 하는 방법
//class Client(val name: String, val postalCode: Int) {
//    override fun toString(): String = "Client (name=$name, postalCode=$postalCode)"
//    override fun equals(other: Any?): Boolean {
//        if (other == null || other !is Client)
//            return false
//        return name == other.name && postalCode == other.postalCode
//    }
//    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
//}

// data 변경자를 붙이면 자동으로 이루어진다.(컴파일러가)
data class Client(val name: String, val postalCode: Int)

fun main() {
    val processed = hashSetOf(Client("오현석", 4122))
    println(processed.contains(Client("오현석", 4122)))
    // client가 hashcode를 정의하지 않아 false 리턴.
    // hashcode 정의 후, 돌리면 true 리턴.

}
