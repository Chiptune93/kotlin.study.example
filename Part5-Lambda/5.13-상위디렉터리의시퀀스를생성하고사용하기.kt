package `Part5-Lambda`

import java.io.File

fun main() {
    // 첫번째 원소를 지정(this) 하고, 한 원소부터 다음 원소를 계산하는 방법을 제공하여 시퀀스를 생성한다.
    fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }

    val file =
        File("/Users/dk/Documents/git-for-chiptune/kotlin.study.example/Part5-Lambda/5.13-상위디렉터리의시퀀스를생성하고사용하기.kt")
    println(file.isInsideHiddenDirectory())
}
