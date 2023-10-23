package `Part4-ClassObjectInterface`

class CustomDuck(_f: FlyBehavior, _q: QuackBehavior) : Duck() {

    override var fb = _f
    override var qu = _q


    override fun fly(cnt: Int) {
        fb.fly(cnt)
    }

    override fun quack() {
        qu.quack()
    }

    companion object InfoTag {
        var price = 2000
        var madeof = "china"
        fun dp() = println("price : $price \nmadeof : $madeof")
    }
}
