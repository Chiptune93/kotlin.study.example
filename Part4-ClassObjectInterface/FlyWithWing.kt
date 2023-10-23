package `Part4-ClassObjectInterface`

class FlyWithWing : FlyBehavior {
    // 고유 반복 횟수
    var repeatBehavior: Int = 10
        private set

    override fun fly(cnt: Int) {
        if (cnt != 0)
            repeatBehavior = cnt
        for (i in 1..repeatBehavior) {
            println("... ... Fly With Wing ... ... ")
        }
    }
}
