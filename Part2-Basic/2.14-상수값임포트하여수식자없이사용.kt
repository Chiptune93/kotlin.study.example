package `Part2-Basic`

import `Part2-Basic`.Colors.*

fun getWarmth(color: Colors) = when (color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}
