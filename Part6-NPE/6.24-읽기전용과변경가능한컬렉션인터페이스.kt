package `Part6-NPE`

fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    for(item in source) { // 소스 컬렉션의 모든 원소에 대해 루프.
        target.add(item) // 변경 가능한 타겟 컬렉션에 원소를 추가한다.
    }
}

fun main() {
    val source: Collection<Int> = arrayListOf(3,5,7)
    var target: MutableCollection<Int> = arrayListOf(1)
    copyElements(source,target)
    println(target)
}
