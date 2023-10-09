package `Part2-Basic`

import `Part2-Basic`.Colors.*

fun mix(c1: Colors, c2: Colors) =
        when (setOf(c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty Color")
        }


fun main() {
    println(mix(BLUE, YELLOW))
}
