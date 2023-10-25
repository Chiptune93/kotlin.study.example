package `Part5-Lambda`

import java.io.File

fun main() {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    // sum 하기 전까지 위에 2개는 계산하지 않음.
    println(numbersTo100.sum())

    val file = File("/Users/dk/Documents/git-for-chiptune/kotlin.study.example/Part5-Lambda/5.12-자연수의시퀀스를생성하고사용하기.kt")
    println(file.isInsideHiddenDirectory())

}

// 첫번째 원소를 지정(this) 하고, 한 원소부터 다음 원소를 계산하는 방법을 제공하여 시퀀스를 생성한다.
fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }
