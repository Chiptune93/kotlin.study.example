package `Part5-Lambda`

fun alphabet4() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I Know the alphabet!")
}
