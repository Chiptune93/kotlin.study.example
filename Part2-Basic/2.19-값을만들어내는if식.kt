package `Part2-Basic`

// 중첩 if 사용.
fun eval2(e: Expr): Int =
        if (e is Num) {
            e.value
        } else if (e is Sum) {
            eval2(e.right) + eval2(e.left)
        } else {
            throw IllegalArgumentException("Unknown expression")
        }

fun main() {
    println(eval2(Sum(Num(1), Num(2))))
}
