package `Part2-Basic`

fun eval3(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval3(e.right) + eval3(e.left)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main() {
    println(eval3(Sum(Num(1), Num(2))))
}
