// 값을 저장하기 위한 데이터 클래스 선언
data class NameComponents(val name: String, val extension: String)

fun splitFilename(fullName: String): NameComponents {
    val result = fullName.split('.', limit = 2)
    // 함수에서 데이터 클래스의 인스턴스 반환
    return NameComponents(result[0], result[1])
}

fun main() {
    // 구조 분해 선언 구문을 사용해 데이터 클래스를 푼다.
    val (name, ext) = splitFilename("7.14-구조분해선언을사용해여러값반환하기.kt")
    println(name)
    println(ext)
}
