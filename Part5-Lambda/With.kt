package `Part5-Lambda`

//fun alphabet(): String {
//    val stringBuilder = StringBuilder()
//    return with(stringBuilder) {// 메서드를 호출하려는 수신객체를 지정한다.
//        for (letter in 'A'..'Z') {
//            this.append(letter) // this를 명시해서 앞에서 지정한 수신객체의 메서드를 호출한다.
//        }
//        append("\n Now I know the alphabet!") // this를 생략하고 메서드를 호출한다.
//        this.toString() // 람다에서 값을 반환한다.
//    }
//}

//...

// 본문을 식으로 변경하여 간소화.
fun alphabet() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\n Now I know the alphabet!")
    toString()
}

// BuildString 사용하면 더 간단하게 가능(문자열에서 유용)
fun alphabetBuildString() = buildString {
    for(letter in 'A'..'Z') {
        append(letter)
    }
    append("\n Now I know the alphabet!")
}
