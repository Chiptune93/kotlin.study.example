package `Part2-Basic`

import `Part2-Basic`.Colors.*

fun mixOptimized(c1: Colors, c2: Colors) =
        when {
            (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
            (c1 == BLUE && c2 == YELLOW) || (c1 == YELLOW && c2 == BLUE) -> GREEN
            (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
            else -> throw Exception("Dirty color")
        }


fun main() {
    println(mixOptimized(BLUE, YELLOW))
}
