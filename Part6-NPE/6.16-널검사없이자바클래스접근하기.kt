package `Part6-NPE`

import Person3

fun yellAt(person: Person3) {
    // toUpperCase의 수신객체 person.name이 null 이어서 예외가 발생한다.
    println(person.name.toUpperCase() + "!!!")
}

fun main() {
    yellAt(Person3(null))
}
