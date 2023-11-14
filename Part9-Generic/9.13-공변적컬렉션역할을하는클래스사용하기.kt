class Cat2 : Animal() { // Cat은 Animal 이다.
    fun cleanLitter() {
        TODO("do what?")
    }
}

class Herd2<out T : Animal> { // 이제 타입 파라미터로 인해 T는 공변적이다.
    val size: Int get() = 100
    operator fun get(i: Int): T {
        TODO("no code")
    }
}

fun feedAll(animals: Herd2<Animal>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}

fun takeCareOfCats(cats: Herd2<Cat2>) {
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()
    }
    // 에러가 발생하지 않는다. 캐스팅이 필요없다.
    feedAll(cats)
}