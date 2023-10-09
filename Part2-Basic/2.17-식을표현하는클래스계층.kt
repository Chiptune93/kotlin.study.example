package `Part2-Basic`

interface Expr
class Num(val value: Int) : Expr // Value라는 프로퍼티만 존재하는 단순 클래스
class Sum(val left: Expr, val right: Expr) : Expr // Expr 객체라면 어떤 것이나 Sum 연산의 인자 될 수 있다
























