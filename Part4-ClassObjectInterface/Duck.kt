package `Part4-ClassObjectInterface`

abstract class Duck {
    abstract var fb: FlyBehavior
    abstract var qu: QuackBehavior

    abstract fun fly(cnt:Int)
    abstract fun quack()

    open fun display() {}
}
