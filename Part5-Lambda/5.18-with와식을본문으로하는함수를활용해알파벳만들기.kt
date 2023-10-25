package `Part5-Lambda`

// 본문을 식으로 변경하여 간소화.
fun alphabet3() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\n Now I know the alphabet!")
    toString()
}

fun main() {
    println(alphabet2())
}
