package `Part4-ClassObjectInterface`

fun main() {
    val flyWithWing = FlyWithWing()
    val quackHigh = QuackHigh()

    // 1. 컴패니언은 어떻게 활용해야 할까?
    CustomDuck.dp()
    val customDuck = CustomDuck(flyWithWing, quackHigh)
    customDuck.fly(11)
    customDuck.quack()
}
