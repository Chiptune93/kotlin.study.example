import java.time.LocalDate

fun main() {
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10) // 오늘부터 시작해 10일짜리 범위를 생성
    println(now.plusWeeks(1) in vacation) // 특정 날짜가 날짜 범위 안에 있는 지 검사한다.
    // true
}

