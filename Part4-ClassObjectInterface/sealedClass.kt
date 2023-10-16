package `Part4-ClassObjectInterface`

//interface Expr
sealed class Expr // sealed로 변경하여 모든 하위 클래스를 중첩 클래스로 나열한다.
class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()

fun eval(e: Expr): Int =
        when (e) { // when 식이 모든 하위 클래스를 검사하므로 별도의 else 분기가 없어도 된다.
            is Num -> e.value
            is Sum -> eval(e.right) + eval(e.left)
            // else -> throw IllegalArgumentException("Unknown expression") // 꼭 else 분기가 있어야 한다.
        }
