package `Part6-NPE`

import Person3

fun yellAtSafe(person: Person3) {
    // 엘비스 연산자를 통해 null 처리를 하고 있으므로 예외가 발생하지 않음.
    println((person.name ?: "Anyone").toUpperCase() + "!!!")
}
