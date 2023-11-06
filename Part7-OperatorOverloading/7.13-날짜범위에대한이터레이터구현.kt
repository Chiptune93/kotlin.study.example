import java.time.LocalDate

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
        object : Iterator<LocalDate> { // LocalDate 원소에 대한 이터레이터를 구현한다.
            var current = start
            override fun hasNext() =
                    current <= endInclusive // 날짜를 비교한다.
            override fun next() = // 현재날짜를 저장한 다음에 날짜를 변경한다. 그 후 저장해둔 날짜를 반환한다.
                    current.apply { current = plusDays(1) } // 현재날짜를 1일뒤로 반환한다.
        }

fun main() {
    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff) { // dayoff 에 대응하는 이터레이터 함수가 있으면 dayoff에 대해 이터레이션 한다.
        println(dayOff)
    }
}