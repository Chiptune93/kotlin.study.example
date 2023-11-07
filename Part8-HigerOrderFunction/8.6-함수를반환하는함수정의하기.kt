enum class Delivery { STANDARD, EXPEDITED }
class Order(val itemCount: Int)
// 함수를 반환하는 함수를 선언한다.
fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    if(delivery == Delivery.EXPEDITED) {
        // 함수에서 람다를 반환한다.
        return { order -> 6 + 2.1 * order.itemCount}
    }
    return {order -> 1.2 * order.itemCount}
}

fun main() {
    // 반환받은 함수를 변수에 저장한다.
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    // 반환받은 함수를 호출한다.
    println("Shipping costs ${calculator(Order(3))}")
}
