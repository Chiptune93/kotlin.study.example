package `Part5-Lambda`

// 본문을 식으로 변경하여 간소화.
fun alphabet2(): String {
    return with(StringBuilder()) { // 메소드를 호출하려는 수신객체를 지정한다.
        for (letter in 'A'..'Z') {
            this.append(letter) // this를 명시해서 앞에서 지정한 수신객체 메서드를 호출한다.
        }
        append("\n Now I know the alphabet!") // this를 생략하고 메서드 호출.
        this.toString()// 람다에서 값을 반환한다.
    }
}

fun main() {
    println(alphabet2())
}
