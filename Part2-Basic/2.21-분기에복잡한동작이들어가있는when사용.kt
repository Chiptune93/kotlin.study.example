package `Part2-Basic`

fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num : ${e.value}")
                e.value
            }

            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: $left + $right")
                left + right
            }

            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main() {
    println(evalWithLogging(Sum(Num(20), Num(40))))
}
