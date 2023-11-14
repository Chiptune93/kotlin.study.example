class Cat: Animal() { // Cat은 Animal 이다.
    fun cleanLitter() {
        TODO("do what?")
    }
}

fun takeCareOfCats(cats:Herd<Cat>) {
    for ( i in 0 until cats.size) {
        cats[i].cleanLitter()
        // Kotlin: Type mismatch: inferred type is Herd<Cat> but Herd<Animal> was expected
        // feedAll(cats)

    }
}