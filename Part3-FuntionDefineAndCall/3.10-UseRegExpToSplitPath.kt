package `Part3-FuntionDefineAndCall`

fun parsePathRegExp(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured // 정규식 매칭 결과를 분해하여 각 변수에 대입하도록 하는 구문
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main() {
    parsePathRegExp("/Users/dk/Documents/git-for-chiptune/kotlin.study.example/Part3-FuntionDefineAndCall/3.9-StringExtendFuncToSplit.kt")
}
