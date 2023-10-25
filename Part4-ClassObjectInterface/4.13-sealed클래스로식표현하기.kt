package `Part4-ClassObjectInterface`

sealed class Expr1 { // sealed로 변경하여 모든 하위 클래스를 중첩 클래스로 나열한다.
    class Num(val value: Int) : Expr1()
    class Sum(val left: Expr1, val right: Expr1) : Expr1()
}

fun eval(e: Expr1): Int =
    when (e) { // when 식이 모든 하위 클래스를 검사하므로 별도의 else 분기가 없어도 된다.
        is Expr1.Num -> e.value
        is Expr1.Sum -> eval(e.right) + eval(e.left)
        // else -> throw IllegalArgumentException("Unknown expression")
    }
