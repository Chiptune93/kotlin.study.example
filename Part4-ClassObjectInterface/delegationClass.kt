package `Part4-ClassObjectInterface`

// 필요한 메소드만 오버라이드 구현, 나머지는 위임할 수 있다.
class CountingSet<T>(
        val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet { // MutableCollection의 구현을 innerSet에게 위임한다.
    var objectsAdded = 0

    // 아래 오버라이드 된 메소드들은 위임하지 않고 새로 구현한다.
    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}
