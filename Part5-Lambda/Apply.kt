package `Part5-Lambda`

// apply는 확장함수로 정의되어있다.
fun alphabetApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\n Now I know the alphabet!")
}.toString()
