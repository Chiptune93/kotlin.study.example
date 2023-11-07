fun main() {
    val averageMobileDuration = log
        // 람다 함수를 통해 복잡한 질의를 해결한다.
        .filter { it.os in setOf(OS.IOS, OS.ANDROID) }
        .map(SiteVisit::duration)
        .average()

    println(averageMobileDuration)
}
