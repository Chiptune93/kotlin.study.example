package `Part2-Basic`

fun getMnemonic2(color: Colors) =
        when (color) {
            Colors.RED, Colors.ORANGE, Colors.YELLOW -> "Warm"
            Colors.GREEN -> "Neutral"
            Colors.BLUE, Colors.INDIGO, Colors.VIOLET -> "Cold"
        }

fun main() {
    println(getMnemonic2(Colors.BLUE))
}
