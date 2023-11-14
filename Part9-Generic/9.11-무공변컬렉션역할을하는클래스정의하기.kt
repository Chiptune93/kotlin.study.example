open class Animal {
    fun feed() { /**/
    }
}

class Herd<T : Animal> { // 이 타입 파라미터를 무공변성으로 지정한다.
    val size: Int get() = 100
    operator fun get(i: Int): T {
        TODO("no code")
    }
}

fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}