import java.math.BigDecimal

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main() {
    var bd = BigDecimal.ZERO
    println(bd++) // 실행 후, 증가
    println(++bd) // 실행 전, 증가
    // 0
    // 2
}
