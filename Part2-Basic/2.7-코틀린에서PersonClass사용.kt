package `Part2-Basic`

fun main(args: Array<String>) {
    // new 키워드 없이 생성자 호출
    val person = PersonKotlin("Bob",true)
    // 프로퍼티를 직접 사용해도 코틀린이 자동으로 Getter 호출.
    println(person.name)
    println(person.isMarried)
}
