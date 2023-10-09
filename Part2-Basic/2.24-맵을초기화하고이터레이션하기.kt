package `Part2-Basic`

import java.util.*

fun main() {
    val binaryReps = TreeMap<Char, String>() // treeMap 사용.

    for (c in 'A'..'F') { // A부터 F까지 반복.
        val binary = Integer.toBinaryString(c.toInt()) // 아스키 -> 2진
        binaryReps[c] = binary // c를 키로 2진 표현을 맵에 저장
    }

    for ((letter, binary) in binaryReps) { // 맵에 대한 이터레이션
        println("$letter = $binary")
    }
}
